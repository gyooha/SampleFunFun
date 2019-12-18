package io.seroo.sampleerrorhandling.main.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.seroo.sampleerrorhandling.main.domain.GetMainItemListSuccessUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class MainViewModel(
    private val getMainItemList: GetMainItemListSuccessUseCase
) : ViewModel() {

    private val _mainItemList = MutableLiveData<List<MainItem>>()
    val mainItemList: LiveData<List<MainItem>> get() = _mainItemList

    fun getMainItemList() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = getMainItemList.invoke()

            launch(Dispatchers.Main) {
                _mainItemList.value = result
            }
        }
    }

    override fun onCleared() {
        super.onCleared()

        viewModelScope.cancel()
    }
}