package com.example.cajaeuros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dosEurosEditText:EditText
    lateinit var unEuroEditText:EditText
    lateinit var cincuentaCentEditText:EditText
    lateinit var veinteCentEditText:EditText
    lateinit var diezCentEditText:EditText
    lateinit var calcularButton:Button
    lateinit var resultadoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) { // el on create lo podemos ver en el ciclo vida
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // la view tiwnw asociado ese layout
        dosEurosEditText=findViewById(R.id.editText2euros)
        unEuroEditText=findViewById(R.id.editText1euro)
        cincuentaCentEditText=findViewById(R.id.editText50cent)
        veinteCentEditText=findViewById(R.id.editText20cent)
        diezCentEditText=findViewById(R.id.editText10cent)
        calcularButton=findViewById(R.id.button2)
        resultadoTextView=findViewById(R.id.textViewResultado)

        Log.i("Caja euros", "2 euros"+dosEurosEditText.text.toString())
        calcularButton.setOnClickListener { View ->
            Log.i("Traza_CajaEuros", "Pulsando boton ...")
            try{
            var dosEurosImporte=2*dosEurosEditText.text.toString().toInt()
            var unEurosImporte=unEuroEditText.text.toString().toInt()
            var cincuentaCentEurosImporte=0.5*cincuentaCentEditText.text.toString().toInt()
            var veinteCentEurosImporte=0.2*veinteCentEditText.text.toString().toInt()
            var diezCentEurosImporte=0.1*diezCentEditText.text.toString().toInt()

            var resultado=dosEurosImporte+unEurosImporte+cincuentaCentEurosImporte+
                    veinteCentEurosImporte+diezCentEurosImporte
            resultadoTextView.setText(resultadoTextView.text.toString()+resultado.toString())
            }catch (e:NumberFormatException){
                Toast.makeText(this, "Formato incorrecto", Toast.LENGTH_LONG).show()
            }
        }
    }

    //fun calcular(view: View) {}
}