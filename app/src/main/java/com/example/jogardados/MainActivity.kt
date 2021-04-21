package com.example.jogardados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val fotoDado : ImageView = findViewById(R.id.imageView)
        when(dado.Jogar()){
            1 -> fotoDado.setImageResource(R.drawable.dice_1)
            2 -> fotoDado.setImageResource(R.drawable.dice_2)
            3 -> fotoDado.setImageResource(R.drawable.dice_3)
            4 -> fotoDado.setImageResource(R.drawable.dice_4)
            5 -> fotoDado.setImageResource(R.drawable.dice_5)
            6 -> fotoDado.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dado(private val nrLados : Int){
    fun Jogar() : Int {
        return (1.. nrLados).random()
    }
}