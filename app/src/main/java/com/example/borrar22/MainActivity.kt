package com.example.borrar22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numeroA: Int=0
    var numeroB: Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sumar(v: View){
        if (editTextNumeroA.text.length<=0 || editTextNumeroB.text.length<=0)
        {
            Toast.makeText(this, "Error, introducir números", Toast.LENGTH_SHORT).show()
            return

        }
        numeroA=editTextNumeroA.text.toString().toInt()
        numeroB=editTextNumeroB.text.toString().toInt()
        val resultado=numeroA+numeroB
        textViewResultado.text=resultado.toString()

    }

    fun writeNum(v: View){
        val botonPulsado=findViewById<Button>(v.id)
        editTextNumeroA.setText(editTextNumeroA.text.toString()+botonPulsado.text)
    }
}
