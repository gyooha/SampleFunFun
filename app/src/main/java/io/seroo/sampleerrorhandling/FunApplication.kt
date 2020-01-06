package io.seroo.sampleerrorhandling

import android.app.Activity
import android.app.Application
import android.content.Context
import io.seroo.sampleerrorhandling.di.ApplicationComponent
import io.seroo.sampleerrorhandling.di.DaggerApplicationComponent

class FunFunApplication : Application() {

    private val component: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .factory()
            .create(this@FunFunApplication)
    }

    companion object {
        fun provideComponent(context: Context): ApplicationComponent {
            return (context.applicationContext as FunFunApplication).component
        }
    }
}

fun Activity.applicationComponent() = FunFunApplication.provideComponent(this)
