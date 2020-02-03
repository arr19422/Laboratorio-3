package com.example.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var show = true
        var texto: TextView = findViewById(R.id.textView)
        var nombre: TextView = findViewById(R.id.textView2)
        var editText: EditText = findViewById(R.id.editText)
        var tikal: Button = findViewById(R.id.button)
        var quirigua: Button = findViewById(R.id.button3)
        var puerto: Button = findViewById(R.id.button2)
        var float: FloatingActionButton = findViewById(R.id.floatingActionButton)

        float.setOnClickListener(){
            if (show){
                texto.setText(editText.text)
                texto.visibility = View.VISIBLE
                nombre.visibility = View.GONE
                editText.visibility = View.GONE
                show = false
            } else {
                texto.visibility = View.GONE
                nombre.visibility = View.VISIBLE
                editText.visibility = View.VISIBLE
                show = true
            }

        }

        tikal.setOnClickListener(){
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("info", R.string.tikal_info)
            intent.putExtra("titulo", R.string.tikal)

            startActivity(intent)
        }
        quirigua.setOnClickListener(){
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("info", R.string.quirigua_info)
            intent.putExtra("titulo", R.string.quirigua)
            startActivity(intent)
        }
        puerto.setOnClickListener(){
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("info", R.string.puerto_info)
            intent.putExtra("titulo", R.string.puerto_barrios)
            startActivity(intent)
        }
    }
}
