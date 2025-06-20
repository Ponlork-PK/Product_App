package com.example.productapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.productapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCart.setOnClickListener() {
            goToCardActivity()
        }

        binding.itemFirst.setOnClickListener() {
            goToProductDetail()
        }
    }

    private fun goToCardActivity() {
        val intentData = Intent(this, CardActivity::class.java)
        startActivity(intentData)
    }

    private fun goToProductDetail() {
        val intentData = Intent(this, ProductDetailActivity::class.java)
        startActivity(intentData)
    }
}