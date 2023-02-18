package com.example.tutorials

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tutorials.R.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val name : TextView = findViewById(R.id.name)
        val age : TextView = findViewById(R.id.age)
        val country : TextView = findViewById(R.id.country)

       val button : Button = findViewById(id.btnapply)
        button.setOnClickListener{
            val name = name.text.toString()
            val age = age.text.toString().toInt()
            val country = country.text.toString()


            Intent(this,SecondActivity::class.java).also{
            it.putExtra("EXTRA_NAME", name)
            it.putExtra("EXTRA_AGE", age)
            it.putExtra("EXTRA_COUNTRY", country)
                startActivity(it)
            }

        }

    }
}


