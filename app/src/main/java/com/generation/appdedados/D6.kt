package com.generation.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class D6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d6)

        val jogard6 = findViewById<Button>(R.id.jogarD6)
        jogard6.setOnClickListener { rolarDados(6) }


    }

    fun rolarDados(lados: Int) {
        val valor = (1..lados).random()
        val resultadoDado6 = findViewById<TextView>(R.id.resultadoD6)
        resultadoDado6.text = valor.toString()
    }
}