package com.example.adc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText = findViewById<TextView>(R.id.hello_text)
        helloText.text = "Voy a ser el rey de los piratas"
    
    }
}