package com.example.tp_ex1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.tp_ex1.R

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use the consistent variable name
        listView = findViewById(R.id.listView)

        val langs = listOf("Java", "C#", "Python", "Kotlin", "Swift")

        val adapter = LanguagesAdapter(this, langs)
        listView.adapter = adapter
    }
}
