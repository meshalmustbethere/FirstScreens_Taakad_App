package com.example.firstapp.UI

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.inputmethod.InputBinding
import com.example.firstapp.R
import com.example.firstapp.databinding.ActivitySplashscreenBinding

@Suppress("DEPRECATION")
class splashscreen : AppCompatActivity() {
    // adding this var
    private lateinit var binding: ActivitySplashscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Handler().postDelayed({
            val intent = Intent(this,Loginactivity::class.java)
            startActivity(intent)
            finish()
        },500)
    }
}

