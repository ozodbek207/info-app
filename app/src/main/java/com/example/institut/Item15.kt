package com.example.institut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class Item15 : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var image: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item15)
        textView = findViewById(R.id.information)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        val title = resources.getString(R.string.info15)
        textView.text = title

        image = findViewById(R.id.imageView)
        image.setOnClickListener {
            onBackPressed()
        }
    }
}