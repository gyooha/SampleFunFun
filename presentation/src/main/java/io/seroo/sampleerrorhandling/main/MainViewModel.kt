package io.seroo.sampleerrorhandling.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.seroo.common.fold
import io.seroo.common.map
import io.seroo.domain.usecase.GetMainItemListSuccessUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val getMainItemList: GetMainItemListSuccessUseCase
) : ViewModel() {

    private val _mainItemList = MutableLiveData<List<MainItem>>()
    val mainItemList: LiveData<List<MainItem>> get() = _mainItemList

    private val _error = MutableLiveData<Throwable>()
    val error: LiveData<Throwable> get() = _error

    fun getMainItemList() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = getMainItemList.invoke()
                .map { it.map { it.toMainItem() } }

            result.fold(
                success = {
                    launch(Dispatchers.Main) {
                        _mainItemList.value = it
                    }
                },
                failure = {
                    withContext(Dispatchers.Main) {
                        _error.value = it
                    }
                }
            )
        }
    }

    override fun onCleared() {
        super.onCleared()

        viewModelScope.cancel()
    }
}