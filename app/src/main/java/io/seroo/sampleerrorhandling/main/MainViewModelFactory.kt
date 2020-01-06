package io.seroo.sampleerrorhandling.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.seroo.core.service.repository.SampleRepository

class MainViewModelFactory(
    private val repository: SampleRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(SampleRepository::class.java)
            .newInstance(repository)
    }
}