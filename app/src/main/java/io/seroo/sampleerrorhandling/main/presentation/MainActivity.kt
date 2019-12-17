package io.seroo.sampleerrorhandling.main.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import io.seroo.sampleerrorhandling.applicationComponent
import io.seroo.sampleerrorhandling.databinding.ActivityMainBinding
import io.seroo.sampleerrorhandling.main.di.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject lateinit var factory: MainViewModelFactory

    private val mainComponent: MainComponent by lazy {
        applicationComponent()
            .mainComponent()
            .create(this@MainActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainComponent.inject(this@MainActivity)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val vm2 = ViewModelProviders.of(this@MainActivity, factory)[MainViewModel::class.java]

        //inject
        binding.apply {
            vm = vm2
            lifecycleOwner = this@MainActivity
        }
    }
}
