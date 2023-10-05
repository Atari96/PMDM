package com.example.alarmaactivity23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ponerMensaje: EditText =findViewById(R.id.editTextMensaje)
        var ponerHora: EditText =findViewById(R.id.editTextHora)
        var ponerMinutos: EditText =findViewById(R.id.editTextMinutos)
        var button: Button= findViewById(R.id.buttonAlarma)

        button.setOnClickListener(){
            var mensaje= ponerMensaje.text.toString()
            var hora = ponerHora.text.toString().toInt()
            var minuto = ponerMinutos.text.toString().toInt()
            createAlarm(mensaje, hora, minuto)
        }
    }
    fun createAlarm(message: String, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        }
        if (intent.resolveActivity(packageManager) == null) {
            startActivity(intent)
        }
    }
}