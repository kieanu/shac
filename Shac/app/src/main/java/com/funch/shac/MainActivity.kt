package com.funch.shac

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.funch.shac.R
import com.funch.shac.databinding.ActivityMainBinding
import com.funch.shac.databinding.FragmentDashboardBinding
import com.funch.shac.ui.extension.showSnackBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private var backPressedOnce = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        navController = findNavController(R.id.nav_host_fragment_activity_main)
        navView.setupWithNavController(navController)
        // showSnackBar(binding.root, "ㅎㅇ")
        onBackPressedDispatcher.addCallback(this, object: OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (navController.graph.startDestinationId == navController.currentDestination?.id) {
                    if (backPressedOnce) {
                        onBackPressedDispatcher.onBackPressed()
                        return
                    }

                    backPressedOnce = true
                    showSnackBar(binding.root, getString(R.string.app_exit_label))

                    lifecycleScope.launch {
                        delay(2000)
                        backPressedOnce = false
                    }
                } else {
                    onBackPressedDispatcher.onBackPressed()
                }
            }
        })
    }
}