package io.seroo.sampleerrorhandling.di

import dagger.BindsInstance
import dagger.Component
import io.seroo.sampleerrorhandling.FunFunApplication
import io.seroo.sampleerrorhandling.main.di.MainComponent
import io.seroo.sampleerrorhandling.main.di.MainModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance funFunApplication: FunFunApplication
        ): ApplicationComponent
    }

    fun mainComponent(): MainComponent.Factory

    fun inject(funFunApplication: FunFunApplication)
}