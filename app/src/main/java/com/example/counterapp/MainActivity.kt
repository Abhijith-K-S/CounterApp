package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = findViewById<TextView>(R.id.counter)
        val minus = findViewById<Button>(R.id.minus)
        val plus = findViewById<Button>(R.id.plus)

        minus.setOnClickListener {
           var text = counter.text.toString().toInt()
            text -= 1
           counter.text = text.toString()
        }

        plus.setOnClickListener {
            var text = counter.text.toString().toInt()
            text += 1
            counter.text = text.toString()

            if(text==10) {
                val toastText = Toast.makeText(this, "Value is 10", Toast.LENGTH_SHORT)
                toastText.show()
            }
        }
    }
}