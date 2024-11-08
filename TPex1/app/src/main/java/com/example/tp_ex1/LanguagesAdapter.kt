package com.example.tp_ex1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class LanguagesAdapter (
    val contex : Context,
    val listLang : List<String>
): BaseAdapter(){

        override fun getCount(): Int {
            return listLang.size
        }

        override fun getItem(p0: Int): Any {
            return listLang[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view =p1?: LayoutInflater.from(contex).inflate(R.layout.add_img,p2,false)

        val title = view.findViewById<TextView>(R.id.text)
        val icon = view.findViewById<ImageView>(R.id.icon)

        title.text = listLang[p0]
        icon.setImageResource(R.drawable.img)

        return view

    }
}