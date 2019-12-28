package io.seroo.sampleerrorhandling.main.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import io.seroo.core.service.SampleRepositoryImpl
import io.seroo.domain.usecase.GetMainItemListSuccessUseCase
import io.seroo.sampleerrorhandling.main.MainActivity
import io.seroo.sampleerrorhandling.main.list.MainAdapter
import io.seroo.sampleerrorhandling.main.MainViewModelFactory

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
            repositoryImpl: SampleRepositoryImpl
        ): GetMainItemListSuccessUseCase =
            GetMainItemListSuccessUseCase(
                repositoryImpl
            )

        @Provides
        @JvmStatic
        fun provideMainAdapter(): MainAdapter =
            MainAdapter()
    }

    @Binds
    abstract fun provideActivity(mainActivity: MainActivity): MainActivity
}