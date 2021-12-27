package id.himtif.android.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import id.himtif.android.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        createBottomNavigation()
    }

    /**
        Penambahan Fungsi untuk Bottom Navigation
    */
    private fun createBottomNavigation(){
        val navController = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.navigation_home, R.id.navigation_profile
        ).build()

        navController.addOnDestinationChangedListener{ _, destination, _ ->
            when(destination.id){
                R.id.navigation_home -> binding.navView.visibility = View.VISIBLE
                R.id.navigation_profile -> binding.navView.visibility = View.VISIBLE
                else -> binding.navView.visibility = View.GONE
            }

        }

        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
    }
}