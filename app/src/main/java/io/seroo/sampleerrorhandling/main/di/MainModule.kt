package io.seroo.sampleerrorhandling.main.di

import androidx.lifecycle.ViewModelProviders
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.seroo.core.RemoteService
import io.seroo.sampleerrorhandling.main.data.MainRemoteDataSource
import io.seroo.sampleerrorhandling.main.data.MainRepository
import io.seroo.sampleerrorhandling.main.domain.GetRemoteDataListUseCase
import io.seroo.sampleerrorhandling.main.presentation.MainActivity
import io.seroo.sampleerrorhandling.main.presentation.MainViewModel
import io.seroo.sampleerrorhandling.main.presentation.MainViewModelFactory

@Module
abstract class MainModule {
    @Module
    companion object {
        @Provides
        @JvmStatic
        fun provideMainViewModelFactory(
            getRemoteDataListUseCase: GetRemoteDataListUseCase
        ): MainViewModelFactory = MainViewModelFactory(getRemoteDataListUseCase)

        @Provides
        @JvmStatic
        fun provideGetRemoteDataListUseCase(
            repository: MainRepository
        ): GetRemoteDataListUseCase = GetRemoteDataListUseCase(repository)

        @Provides
        @JvmStatic
        fun provideMainRepositor(
            mainRemoteDataSource: MainRemoteDataSource
        ): MainRepository = MainRepository(mainRemoteDataSource)

        @Provides
        @JvmStatic
        fun provideMainViewModel(
            mainActivity: MainActivity,
            factory: MainViewModelFactory
        ): MainViewModel = ViewModelProviders.of(mainActivity, factory)[MainViewModel::class.java]

        @Provides
        @JvmStatic
        fun provideMainRepository(
            remoteService: RemoteService
        ): MainRemoteDataSource {
            return MainRemoteDataSource(remoteService)
        }
    }

    @Binds
    abstract fun provideActivity(mainActivity: MainActivity): MainActivity
}