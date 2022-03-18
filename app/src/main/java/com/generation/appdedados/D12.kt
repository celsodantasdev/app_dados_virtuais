package com.generation.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class D12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d12)

        val jogarD12 = findViewById<Button>(R.id.jogarD12)
        jogarD12.setOnClickListener { rolarDados(12) }


    }

    fun rolarDados(lados: Int) {
        val valor = (1..lados).random()
        val resultadoDado12 = findViewById<TextView>(R.id.resultadoD12)
        resultadoDado12.text = valor.toString()
    }
}