package io.seroo.sampleerrorhandling.main.domain

import io.seroo.sampleerrorhandling.main.data.MainRepository
import io.seroo.sampleerrorhandling.main.presentation.MainItem
import io.seroo.sampleerrorhandling.main.presentation.toMainItem

class GetMainItemListSuccessUseCase(
    private val mainRepository: MainRepository
) {

    suspend operator fun invoke(): List<MainItem> {
        return mainRepository.callRemoteApiAndSuccess()
            .map { it.toMainItem() }
    }
}