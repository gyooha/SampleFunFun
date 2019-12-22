package io.seroo.sampleerrorhandling.main.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import io.seroo.core.service.RemoteService
import io.seroo.sampleerrorhandling.main.data.MainRemoteDataSource
import io.seroo.sampleerrorhandling.main.data.MainRepository
import io.seroo.sampleerrorhandling.main.domain.GetMainItemListSuccessUseCase
import io.seroo.sampleerrorhandling.main.presentation.MainActivity
import io.seroo.sampleerrorhandling.main.presentation.MainAdapter
import io.seroo.sampleerrorhandling.main.presentation.MainViewModelFactory

@Module
abstract class MainModule {
    @Module
    companion object {
        @Provides
        @JvmStatic
        fun provideMainViewModelFactory(
            getMainItemListSuccessUseCase: GetMainItemListSuccessUseCase
        ): MainViewModelFactory = MainViewModelFactory(getMainItemListSuccessUseCase)

        @Provides
        @JvmStatic
        fun provideGetRemoteDataListUseCase(
            repository: MainRepository
        ): GetMainItemListSuccessUseCase = GetMainItemListSuccessUseCase(repository)

        @Provides
        @JvmStatic
        fun provideMainRepositor(
            mainRemoteDataSource: MainRemoteDataSource
        ): MainRepository = MainRepository(mainRemoteDataSource)

        @Provides
        @JvmStatic
        fun provideMainRepository(
            remoteService: RemoteService
        ): MainRemoteDataSource {
            return MainRemoteDataSource(remoteService)
        }

        @Provides
        @JvmStatic
        fun provideMainAdapter(): MainAdapter = MainAdapter()
    }

    @Binds
    abstract fun provideActivity(mainActivity: MainActivity): MainActivity
}