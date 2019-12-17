package io.seroo.sampleerrorhandling.main.presentation

import androidx.lifecycle.ViewModel
import io.seroo.sampleerrorhandling.main.domain.GetRemoteDataListUseCase

class MainViewModel(
    private val getRemoteDataListUseCase: GetRemoteDataListUseCase
): ViewModel() {
}