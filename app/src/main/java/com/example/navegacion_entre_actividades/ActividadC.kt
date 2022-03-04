package com.example.navegacion_entre_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_c)


        //Configurando el Intent
        val mensaje = intent.getStringExtra("MENSAJE")
        val mensajeA = intent.getStringExtra("MENSAJEA")

        val boton  =findViewById<Button>(R.id.botonC)

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        boton.setOnClickListener {
           val intent  = Intent(this, ActividadB::class.java)
            intent.putExtra("MENSAJE", mensajeA)
            startActivity(intent)

          //finish()
        }
    }
}