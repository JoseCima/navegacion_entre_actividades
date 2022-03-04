package com.example.navegacion_entre_actividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)

        val botonBC = findViewById<Button>(R.id.botonBC)
        val botonBD = findViewById<Button>(R.id.botonBD)

        //Configurando el Intent
        val mensajeC = intent.getStringExtra("MENSAJE")
        val mensajeD = intent.getStringExtra("MENSAJE")


        Toast.makeText(this, mensajeC, Toast.LENGTH_SHORT).show()



        botonBC.setOnClickListener {

            var intent = Intent(this, ActividadC::class.java)
            intent.putExtra("MENSAJE", "Hacia Actividad C")
            intent.putExtra("MENSAJEA", mensajeC)


            startActivity(intent)

        }

        botonBD.setOnClickListener {

            var intent = Intent(this, ActividadD::class.java)
            intent.putExtra("MENSAJE", "Hacia Actividad D")
            intent.putExtra("MENSAJEA", mensajeD)

            startActivity(intent)
        }

    }
}