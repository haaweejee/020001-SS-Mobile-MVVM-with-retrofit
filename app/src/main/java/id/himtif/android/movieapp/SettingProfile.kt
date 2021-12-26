package id.himtif.android.movieapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.himtif.android.movieapp.databinding.ActivityMainBinding
import id.himtif.android.movieapp.databinding.SettingProfileBinding

class SettingProfile : AppCompatActivity() {
    private lateinit var binding: SettingProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SettingProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}