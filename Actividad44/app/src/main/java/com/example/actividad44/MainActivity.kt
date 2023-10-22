package com.example.actividad44

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var importeTextView: TextView = findViewById(R.id.textViewImporte)
        var importe2 = importeTextView.text.toString()
        var cambiar : Button=findViewById(R.id.btnCambiar)

        importeTextView.setOnClickListener {
            Fragmento_cambiar.CambioImporteDialogFragment().show(
                supportFragmentManager, Fragmento_cambiar.CambioImporteDialogFragment.TAG)

            val importe2 = importeTextView.text.toString()
            val bundle = bundleOf("importeKey2" to importe2)
            supportFragmentManager.setFragmentResult("requestKey2", bundle)
        }

        cambiar.setOnClickListener {
            Fragmento_cambiar.CambioImporteDialogFragment().show(
                supportFragmentManager, Fragmento_cambiar.CambioImporteDialogFragment.TAG)
        }
        supportFragmentManager.setFragmentResultListener(/* requestKey = */ "requestKey",this){
                key, bundle ->
            // We use a String here, but any type that can be put in a Bundle is supported.
            val importe:String? = bundle.getString("importeKey")

            var importeTextView: TextView =findViewById(R.id.textViewImporte)
            importeTextView.setText(importe)
        }
    }
}