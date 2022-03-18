package com.generation.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class D20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d20)

        val jogard20 = findViewById<Button>(R.id.jogarD20)
        jogard20.setOnClickListener { rolarDados(20) }


    }

    fun rolarDados(lados: Int) {
        val valor = (1..lados).random()
        val resuldadoD20 = findViewById<TextView>(R.id.resultadoD20)
        resuldadoD20.text = valor.toString()
    }
}