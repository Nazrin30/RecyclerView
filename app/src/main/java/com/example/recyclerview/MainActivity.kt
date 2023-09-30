package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val book1 = Book("1984", "george_orwell_1984", 12.0f)
        val book2 = Book("Pride and Prejudice", "pride_and_prejudice", 14.5f)
        val book3 = Book("Robinson Crusoe", "robinson_crusoe", 25.9f)
        val book4 = Book("Sapiens", "sapiens", 18.9f)
        val book5 = Book("Snowman", "snowman", 20.5f)
        val book6 = Book("The Power of Now", "the_power_of_now", 15.9f)

        val list = ArrayList<Book>()

        list.add(book1)
        list.add(book2)
        list.add(book3)
        list.add(book4)
        list.add(book5)
        list.add(book6)

       val adapter = Adapter(this,list)
       binding.recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
       binding.recyclerView.adapter = adapter

    }
}