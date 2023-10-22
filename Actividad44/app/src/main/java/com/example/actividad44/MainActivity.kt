package com.example.actividad44

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cambiar : Button=findViewById(R.id.btnCambiar)
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