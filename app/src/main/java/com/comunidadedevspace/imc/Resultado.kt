package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULTADO_SLIQUIDO = "ResultadoActivity.KEY_LIQUIDO"

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)

        val resultado = intent.getFloatExtra(KEY_RESULTADO_SLIQUIDO, 0f)

        val tvResultado = findViewById<TextView>(R.id.salarioLiquido)

        tvResultado.text = resultado.toString()

    }
}