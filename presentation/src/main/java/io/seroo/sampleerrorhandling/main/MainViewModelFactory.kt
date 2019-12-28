package io.seroo.sampleerrorhandling.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.seroo.domain.usecase.GetMainItemListSuccessUseCase

class MainViewModelFactory(
    private val getMainItemListSuccessUseCase: GetMainItemListSuccessUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(GetMainItemListSuccessUseCase::class.java)
            .newInstance(getMainItemListSuccessUseCase)
    }
}