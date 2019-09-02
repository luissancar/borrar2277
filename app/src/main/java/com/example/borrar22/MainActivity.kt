package com.example.borrar22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numeroA: Int=0
    var numeroB: Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sumar(v: View){

        numeroA=editTextNumeroA.text.toString().toInt()
        numeroB=editTextNumeroB.text.toString().toInt()
        val resultado=numeroA+numeroB
        textViewResultado.text=resultado.toString()

    }
}
