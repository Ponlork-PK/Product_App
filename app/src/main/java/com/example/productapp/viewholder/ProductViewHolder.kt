package com.example.productapp.viewholder

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.productapp.ModelAPI.Product
import com.example.productapp.databinding.ViewholderProductListBinding
import com.squareup.picasso.Picasso

class ProductViewHolder(private val binding: ViewholderProductListBinding): ViewHolder(binding.root) {

    fun bind(product: Product) {

        Picasso.get().load(product.imageUrl).into(binding.imgProduct)
        binding.txtProductName.text = product.name
        binding.txtProductPrice.text = product.price

    }
}