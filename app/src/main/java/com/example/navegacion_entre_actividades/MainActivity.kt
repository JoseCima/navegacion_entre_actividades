package com.example.navegacion_entre_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonAB = findViewById<Button>(R.id.botonAB)

        botonAB.setOnClickListener {
            var intent = Intent(this, ActividadB::class.java)
            intent.putExtra("MENSAJE", "Hacia Actividad B")
            startActivity(intent)
        }
    }
}