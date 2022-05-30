package com.example.firstapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import com.example.firstapp.databinding.ActivityLoginactivityBinding

class Loginactivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginactivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}