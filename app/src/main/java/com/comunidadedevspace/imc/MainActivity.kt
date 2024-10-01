package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editBruto = findViewById<TextInputEditText>(R.id.edit_bruto)
        val editDescontos = findViewById<TextInputEditText>(R.id.edit_descontos)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener {
            val brutoStr: String = editBruto.text.toString()
            val descontosStr: String = editDescontos.text.toString()

            if (brutoStr == "" || descontosStr == "") {

                Snackbar.make(
                    editBruto,
                    "PREENCHA OS CAMPOS VAZIOS!",
                    Snackbar.LENGTH_LONG
                ).show()

            } else {
                val bruto: Float = brutoStr.toFloat()
                val descontos: Float = descontosStr.toFloat()

                val calculoDescontos = descontos / 100 * bruto
                val resultado = bruto - calculoDescontos

                val intent = Intent(this, Resultado::class.java)
                intent.putExtra(KEY_RESULTADO_SLIQUIDO, resultado)
                startActivity(intent)

                println(resultado)
            }
        }
    }
}