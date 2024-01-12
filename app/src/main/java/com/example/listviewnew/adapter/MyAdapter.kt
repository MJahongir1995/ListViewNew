package com.example.listviewnew.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewnew.R
import com.example.listviewnew.User
import com.example.listviewnew.databinding.ActivityMainBinding.inflate
import com.example.listviewnew.databinding.ItemBinding

class MyAdapter(private val list:ArrayList<User>, context: Context): ArrayAdapter<User>(context, R.layout.item, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemBinding:ItemBinding

        if (convertView==null){
            itemBinding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
            itemBinding.root.tag = itemBinding
        }else{
            itemBinding = convertView.tag as ItemBinding
        }

        itemBinding.name.text = list[position].name
        itemBinding.imageID.setImageResource(list[position].imageID)

        return itemBinding.root


    }
}