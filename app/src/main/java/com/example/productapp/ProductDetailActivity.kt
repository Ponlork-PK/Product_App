package com.example.productapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.productapp.ModelAPI.Product
import com.example.productapp.ModelAPI.ProductDetail
import com.example.productapp.Service.APIService
import com.example.productapp.databinding.ActivityProductDetailsBinding
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

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

    private fun goToCardActivity(){
        val intentData = Intent(this, CardActivity::class.java)

        startActivity(intentData)
    }

    private fun goBack() {
        finish()
    }


}
