package com.generation.appdedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var telaD6 = findViewById<Button>(R.id.telaD6)
        var telaD12 = findViewById<Button>(R.id.telaD12)
        var tela20 = findViewById<Button>(R.id.telaD20)
0
        var intentTelaD6 = Intent(this,D6:: class.java)
        var intentTelaD12 = Intent(this,D12:: class.java)
        var intentTelaD20 = Intent(this,D20:: class.java)

        telaD6.setOnClickListener {startActivity(intentTelaD6)}
        telaD12.setOnClickListener {startActivity(intentTelaD12)}
        tela20.setOnClickListener {startActivity(intentTelaD20)}


        //val buttonD6 = findViewById<Button>(R.id.telaD6)
        //val buttonD12 = findViewById<Button>(R.id.telaD12)
        //val buttonD20 = findViewById<Button>(R.id.telaD20)
        //Criamos uma referência do butoonD6
        //<Tipo de Objeto Referenciado> (ID do componente)
        //Listener de clique - vai ficar verificando o momento que o usuário clicar no botão
        //e definir o que vai acontecer no momento do clique

        //buttonD6.setOnClickListener {rolarDados(6)}
        //buttonD12.setOnClickListener {rolarDados(12)}
        //buttonD20.setOnClickListener {rolarDados(20)}

    }

    /*fun rolarDados(lados: Int) {
        //o dado vai de 1 até numeroLados
        val valor = (1..lados).random()
        //Armazenando a referencia do textResultado em uma variável
        val textResultado = findViewById<TextView>(R.id.textResultado)
        //Mudamos o texto com o atributo text
        textResultado.text = valor.toString() //text não consegue receber um int, por isso o toString
*/

    }




