package com.example.institut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
private lateinit var constraintLayout1: ConstraintLayout
    private lateinit var constraintLayout2: ConstraintLayout
    private lateinit var constraintLayout3: ConstraintLayout
    private lateinit var constraintLayout4: ConstraintLayout

    private lateinit var constraintLayout6: ConstraintLayout
    private lateinit var constraintLayout7: ConstraintLayout
    private lateinit var constraintLayout8: ConstraintLayout
    private lateinit var constraintLayout9: ConstraintLayout
    private lateinit var constraintLayout10: ConstraintLayout
    private lateinit var constraintLayout11: ConstraintLayout
    private lateinit var constraintLayout12: ConstraintLayout
    private lateinit var constraintLayout13: ConstraintLayout
    private lateinit var constraintLayout14: ConstraintLayout
    private lateinit var constraintLayout15: ConstraintLayout
    private lateinit var constraintLayout16: ConstraintLayout
    private lateinit var constraintLayout17: ConstraintLayout





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolBar))
        supportActionBar!!.title = "Темы"
        constraintLayout1 = findViewById(R.id.item1)
        constraintLayout1.setOnClickListener {
            var intent = Intent(this , Item1::class.java)
            startActivity(intent)
        }
        constraintLayout2 = findViewById(R.id.item2)
        constraintLayout2.setOnClickListener {
            var intent = Intent(this , Item2::class.java)
            startActivity(intent)
        }
        constraintLayout3 = findViewById(R.id.item3)
        constraintLayout3.setOnClickListener {
            var intent = Intent(this , Item3::class.java)
            startActivity(intent)
        }
        constraintLayout4 = findViewById(R.id.item4)
        constraintLayout4.setOnClickListener {
            var intent = Intent(this , Item4::class.java)
            startActivity(intent)
        }

        constraintLayout6 = findViewById(R.id.item6)
        constraintLayout6.setOnClickListener {
            var intent = Intent(this , Item6::class.java)
            startActivity(intent)
        }
        constraintLayout7 = findViewById(R.id.item7)
        constraintLayout7.setOnClickListener {
            var intent = Intent(this , Item7::class.java)
            startActivity(intent)
        }
        constraintLayout8 = findViewById(R.id.item8)
        constraintLayout8.setOnClickListener {
            var intent = Intent(this , Item8::class.java)
            startActivity(intent)
        }
        constraintLayout9 = findViewById(R.id.item9)
        constraintLayout9.setOnClickListener {
            var intent = Intent(this , Item9::class.java)
            startActivity(intent)
        }
        constraintLayout10 = findViewById(R.id.item10)
        constraintLayout10.setOnClickListener {
            var intent = Intent(this , Item10::class.java)
            startActivity(intent)
        }
        constraintLayout11 = findViewById(R.id.item11)
        constraintLayout11.setOnClickListener {
            var intent = Intent(this , Item11::class.java)
            startActivity(intent)
        }
        constraintLayout12 = findViewById(R.id.item12)
        constraintLayout12.setOnClickListener {
            var intent = Intent(this , Item12::class.java)
            startActivity(intent)
        }
        constraintLayout13 = findViewById(R.id.item13)
        constraintLayout13.setOnClickListener {
            var intent = Intent(this , Item13::class.java)
            startActivity(intent)
        }
        constraintLayout14 = findViewById(R.id.item14)
        constraintLayout14.setOnClickListener {
            var intent = Intent(this , Item14::class.java)
            startActivity(intent)
        }
        constraintLayout15 = findViewById(R.id.item15)
        constraintLayout15.setOnClickListener {
            var intent = Intent(this , Item15::class.java)
            startActivity(intent)
        }
        constraintLayout16 = findViewById(R.id.item16)
        constraintLayout16.setOnClickListener {
            var intent = Intent(this , Item16::class.java)
            startActivity(intent)
        }
        constraintLayout17 = findViewById(R.id.item17)
        constraintLayout17.setOnClickListener {
            var intent = Intent(this , Item17::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_nav, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.share -> {

                    val intent = Intent(Intent.ACTION_SEND)
                    intent.type = "type/palin"
                    val shareBody = "You are body"
                    val shareSub = "https://play.google.com/store/apps/details?id=uz.gita.maliybiznes"
                    intent.putExtra(Intent.EXTRA_SUBJECT, shareBody)
                    intent.putExtra(Intent.EXTRA_TEXT, shareSub)
                    startActivity(Intent.createChooser(intent, "Share your app"))
                    true


            }
            R.id.about -> {
                val intent = Intent(this, About::class.java)
                startActivity(intent)
                true
            }


            else -> super.onOptionsItemSelected(item)
        }
    }
}