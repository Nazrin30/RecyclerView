package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.recyclerview.databinding.CardViewDesignBinding

class Adapter(var mContext: Context, var list: List<Book>)
    : RecyclerView.Adapter<Adapter.CardViewDesignHolder>(){

    inner class CardViewDesignHolder ( var binding: CardViewDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignHolder {
        var binding = CardViewDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardViewDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewDesignHolder, position: Int) {
       var book = list.get(position)
        holder.binding.bookImage.setImageResource(
            mContext.resources.getIdentifier(book.image, "drawable", mContext.packageName)
        )
        holder.binding.bookName.text = book.name
        holder.binding.bookPrice.text = book.price.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}