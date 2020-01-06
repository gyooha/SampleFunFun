package io.seroo.sampleerrorhandling.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import io.seroo.sampleerrorhandling.applicationComponent
import io.seroo.sampleerrorhandling.databinding.ActivityMainBinding
import io.seroo.sampleerrorhandling.main.di.MainComponent
import io.seroo.sampleerrorhandling.main.list.MainAdapter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject lateinit var factory: MainViewModelFactory
    @Inject lateinit var mainAdapter: MainAdapter

    private lateinit var mainViewModel: MainViewModel

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

        mainViewModel = ViewModelProviders.of(this@MainActivity, factory)[MainViewModel::class.java]

        binding.apply {
            vm = mainViewModel
            adapter = mainAdapter
            lifecycleOwner = this@MainActivity
        }

        mainViewModel.getMainItemList()
    }
}
