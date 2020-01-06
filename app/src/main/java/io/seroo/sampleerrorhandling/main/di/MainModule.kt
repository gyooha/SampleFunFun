package io.seroo.sampleerrorhandling.main.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import io.seroo.core.service.repository.SampleRepository
import io.seroo.sampleerrorhandling.main.MainActivity
import io.seroo.sampleerrorhandling.main.MainViewModelFactory
import io.seroo.sampleerrorhandling.main.list.MainAdapter

@Module
abstract class MainModule {
    @Module
    companion object {
        @Provides
        @JvmStatic
        fun provideMainViewModelFactory(
            repository: SampleRepository
        ): MainViewModelFactory = MainViewModelFactory(repository)

        @Provides
        @JvmStatic
        fun provideMainAdapter(): MainAdapter =
            MainAdapter()
    }

    @Binds
    abstract fun provideActivity(mainActivity: MainActivity): MainActivity
}