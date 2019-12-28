package io.seroo.domain.usecase

import io.seroo.domain.interfaces.SampleRepository
import io.seroo.domain.entities.SampleEntity

class GetMainItemListSuccessUseCase(
    private val remoteRepository: SampleRepository
) {

    suspend operator fun invoke(): List<SampleEntity> {
        return remoteRepository.callRemoteApiAndSuccess()
    }
}