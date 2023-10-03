package com.example.notasdam2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var calcularButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var textViewMaxima: TextView
        lateinit var textViewMinima: TextView
        lateinit var textViewMedia: TextView

        val textViewNotas = listOf(
            findViewById<EditText>(R.id.EditText1),
            findViewById<EditText>(R.id.EditText2),
            findViewById<EditText>(R.id.EditText3),
            findViewById<EditText>(R.id.EditText4),
            findViewById<EditText>(R.id.EditText5),
            findViewById<EditText>(R.id.EditText6),
            findViewById<EditText>(R.id.EditText7)
        )

        calcularButton = findViewById(R.id.buttonCalcular)

        calcularButton.setOnClickListener { calculos ->
            val listaNotas = mutableListOf<Int>()

            for (textView in textViewNotas) {
                val nota = textView.text.toString().toIntOrNull()
                if (nota != null) {
                    listaNotas.add(nota)
                }
            }

            if (listaNotas.isNotEmpty()) {
                var notaMaxima = listaNotas[0]
                var notaMinima = listaNotas[0]
                var notaMedia : Double = 0.0
                var numeroNotas : Double = 0.0
                var suma : Double = 0.0

                for (elemento in listaNotas){
                    numeroNotas = numeroNotas+1
                    suma = suma + elemento
                    if (elemento > notaMaxima){
                        notaMaxima = elemento
                    }
                    if (elemento <notaMinima){
                        notaMinima = elemento
                    }
                }
                notaMedia = suma/numeroNotas
                var notaMediaFormateada = String.format("%.2f", notaMedia)

                Log.i("Notas", "Nota máxima: " + notaMaxima)
                Log.i("Notas", "Nota mínima: " + notaMinima)
                Log.i("Notas", "Nota media: " + notaMediaFormateada)

                textViewMaxima = findViewById(R.id.textViewMaxima)
                textViewMinima = findViewById(R.id.textViewMinima)
                textViewMedia = findViewById(R.id.textViewMedia)

                textViewMaxima.text = "Nota máxima:  "+notaMaxima
                textViewMinima.text = "Nota mínima:  "+ notaMinima
                textViewMedia.text = "Nota media:  "+ notaMediaFormateada

            }
        }
    }
}
