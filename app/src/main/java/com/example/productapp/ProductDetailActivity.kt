package com.example.productapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.productapp.databinding.ActivityProductDetailsBinding

class ProductDetailActivity: AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCart.setOnClickListener() {
            goToCardActivity()
        }

        binding.btnBack.setOnClickListener() {
            goBack()
        }
    }

    private fun goToCardActivity() {
        val intentData = Intent(this, CardActivity::class.java)
        startActivity(intentData)
    }

    private fun goBack() {
        finish()
    }
}