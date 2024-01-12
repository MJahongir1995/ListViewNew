package com.example.listviewnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listviewnew.adapter.MyAdapter
import com.example.listviewnew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var list:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadData()
    }

    private fun loadData() {
        list = ArrayList()

        for (i in 0..20){
            list.add(User("Sara", R.drawable.a))
            list.add(User("Bob", R.drawable.b))
            list.add(User("George", R.drawable.c))
            list.add(User("Kevin", R.drawable.d))
        }

        val adapter = MyAdapter(list,this)
        binding.listView.adapter = adapter
        
        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "$i", Toast.LENGTH_SHORT).show()
        }
    }
}