package io.seroo.sampleerrorhandling.main.di

import dagger.BindsInstance
import dagger.Subcomponent
import io.seroo.sampleerrorhandling.main.presentation.MainActivity

@Subcomponent(modules = [MainModule::class])
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance mainActivity: MainActivity
        ): MainComponent
    }

    fun inject(mainActivity: MainActivity)
}