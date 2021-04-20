package com.example.jogardados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tentarSorte: Button = findViewById(R.id.button)
        tentarSorte.setOnClickListener{tentarSorte()}
        }

    private fun tentarSorte() {
        val dado = Dado(6)
        val resultTextView : TextView = findViewById(R.id.textView)
        resultTextView.text = dado.Jogar().toString()
    }
}

class Dado(private val nrLados : Int){
    fun Jogar() : Int {
        return (1.. nrLados).random()
    }
}