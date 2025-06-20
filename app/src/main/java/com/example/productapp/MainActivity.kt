package com.example.productapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.productapp.databinding.ActivityMainBinding
import com.example.productapp.fragment.ProductListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val productListFragment = ProductListFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCart.setOnClickListener() {
            goToCardActivity()
        }

        // show layout fragment
        supportFragmentManager.beginTransaction().replace(binding.frgProductList.id, productListFragment).commit()
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