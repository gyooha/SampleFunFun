package io.seroo.sampleerrorhandling.di

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.seroo.core.RemoteService
import io.seroo.core.RemoteServiceImpl
import io.seroo.sampleerrorhandling.FunFunApplication
import javax.inject.Singleton

@Module
abstract class ApplicationModule {
    @Module
    companion object {
        @Singleton
        @Provides
        @JvmStatic
        fun provideRemoteService(): RemoteService = RemoteServiceImpl()
    }

    @Binds
    abstract fun provideApplication(funFunApplication: FunFunApplication): Application
}