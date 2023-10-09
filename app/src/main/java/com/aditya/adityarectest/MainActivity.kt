package com.aditya.adityarectest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aditya.adityarectest.adapter.Adapter
import com.aditya.adityarectest.databinding.ActivityMainBinding
import com.aditya.adityarectest.model.item_Data

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data:MutableList<item_Data> = mutableListOf<item_Data>()

        for (i in 1..30){
        data.add(item_Data("Student$i","Description$i"))
        }






        binding.recMain.layoutManager=LinearLayoutManager(this)

        binding.recMain.adapter=Adapter(data)



    }
}