package io.seroo.sampleerrorhandling.main.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.seroo.sampleerrorhandling.main.domain.GetRemoteDataListUseCase

class MainViewModelFactory(
    private val getRemoteDataListUseCase: GetRemoteDataListUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(getRemoteDataListUseCase::class.java)
            .newInstance(getRemoteDataListUseCase)
    }
}