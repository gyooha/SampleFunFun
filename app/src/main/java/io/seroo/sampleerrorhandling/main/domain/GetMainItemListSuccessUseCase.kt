package io.seroo.sampleerrorhandling.main.domain

import io.seroo.core.service.RemoteRepository
import io.seroo.sampleerrorhandling.main.presentation.MainItem
import io.seroo.sampleerrorhandling.main.presentation.toMainItem

class GetMainItemListSuccessUseCase(
    private val remoteRepository: RemoteRepository
) {

    suspend operator fun invoke(): List<MainItem> {
        return remoteRepository.callRemoteApiAndSuccess()
            .map { it.toMainItem() }
    }
}