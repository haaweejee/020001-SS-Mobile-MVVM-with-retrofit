package id.himtif.android.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.himtif.android.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}