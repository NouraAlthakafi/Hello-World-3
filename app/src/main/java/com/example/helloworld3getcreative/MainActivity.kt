package com.example.helloworld3getcreative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.Name)
        val save = findViewById<Button>(R.id.save)
        val personal = findViewById<TextView>(R.id.personal)
        val Africa = findViewById<CheckBox>(R.id.Af)
        val Arabia = findViewById<CheckBox>(R.id.Ar)
        val CentralAsia = findViewById<CheckBox>(R.id.CeAs)
        val Europe = findViewById<CheckBox>(R.id.Eu)
        val LatinAmerica = findViewById<CheckBox>(R.id.LaAm)
        val MiddleEast = findViewById<CheckBox>(R.id.MiEa)
        val SouthAsia = findViewById<CheckBox>(R.id.SoAs)
        val NorthAmerica = findViewById<CheckBox>(R.id.NoAm)
        val NortheastAsia = findViewById<CheckBox>(R.id.NoAs)
        val Oceania = findViewById<CheckBox>(R.id.Oc)
        val done = findViewById<Button>(R.id.done)
        val endfi = findViewById<TextView>(R.id.endfi)
        val regions= listOf<CheckBox>(Africa, Arabia, CentralAsia, Europe, LatinAmerica, MiddleEast, SouthAsia, NorthAmerica, NortheastAsia, Oceania)
        save.setOnClickListener{
            personal.setText("Hi, ${Name.text}!")
        }
        done.setOnClickListener{
            if (Africa.isChecked && Arabia.isChecked && CentralAsia.isChecked && Europe.isChecked && LatinAmerica.isChecked && MiddleEast.isChecked && SouthAsia.isChecked && NorthAmerica.isChecked && NortheastAsia.isChecked && Oceania.isChecked){
                endfi.setText("Wow! it seems we have a Sinbad!")
            }
            }
        }
    }
