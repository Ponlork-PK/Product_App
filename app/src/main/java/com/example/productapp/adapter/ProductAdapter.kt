package com.example.productapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.productapp.ModelAPI.Product
import com.example.productapp.databinding.ViewholderProductListBinding
import com.example.productapp.viewholder.ProductViewHolder

class ProductAdapter(private val dataSet: List<Product>): Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ViewholderProductListBinding.inflate(layoutInflater)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }
}