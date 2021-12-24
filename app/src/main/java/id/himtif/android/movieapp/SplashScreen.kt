package id.himtif.android.movieapp;

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity(){
    private val myPreference = "himtif"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen_activity)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                finish()
            },3000)
    }
}
