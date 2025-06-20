package com.example.productapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.productapp.databinding.ActivityCardBinding

class CardActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener() {
            goBack()
        }

    }

    private fun goBack() {
        finish()
    }
}