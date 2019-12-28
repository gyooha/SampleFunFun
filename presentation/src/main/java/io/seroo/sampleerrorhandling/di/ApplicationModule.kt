package io.seroo.sampleerrorhandling.di

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.seroo.core.service.SampleRemoteDataSource
import io.seroo.core.service.SampleRepositoryImpl
import io.seroo.core.service.SampleService
import io.seroo.core.service.SampleServiceImpl
import io.seroo.sampleerrorhandling.FunFunApplication
import javax.inject.Singleton

@Module
abstract class ApplicationModule {
    @Module
    companion object {
        @Singleton
        @Provides
        @JvmStatic
        fun provideRemoteService(): SampleService = SampleServiceImpl()

        @Provides
        @JvmStatic
        @Singleton
        fun provideMainRepository(
            sampleService: SampleService
        ): SampleRemoteDataSource = SampleRemoteDataSource(sampleService)

        @Provides
        @JvmStatic
        @Singleton
        fun provideMainRepositor(
            remoteRemoteDataSource: SampleRemoteDataSource
        ): SampleRepositoryImpl = SampleRepositoryImpl(remoteRemoteDataSource)
    }

    @Binds
    abstract fun provideApplication(funFunApplication: FunFunApplication): Application
}