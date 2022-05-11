package com.example.institut

import android.content.ClipData
import android.content.ClipboardManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class Item1 : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var image: ImageView
    private var myClipboard: ClipboardManager? = null
    private var myClip: ClipData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_item1)
        textView = findViewById(R.id.information)
        val title = resources.getString(R.string.info1)
        textView.text = title

        image = findViewById(R.id.imageView)
        image.setOnClickListener {
            onBackPressed()
        }
        textView.setOnClickListener {

        }

    }
//    fun copyText(view: View) {
//        myClip = ClipData.newPlainText("text", textView.text);
//        myClipboard?.setPrimaryClip(myClip);
//
//        Toast.makeText(this, "Text Copied", Toast.LENGTH_SHORT).show();
//    }
}