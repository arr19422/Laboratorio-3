package com.example.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.TextView


class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        var comentar: Button = findViewById(R.id.button4)
        var comentario: EditText = findViewById(R.id.editText2)
        var title: TextView = findViewById(R.id.textView3)
        var information: TextView = findViewById(R.id.textView4)


        if (savedInstanceState == null) {
            val extras = intent.extras
            if (extras == null) {
                var info = null
                var titulo = null
            } else {
                var info = extras.getInt("info")
                var titulo = extras.getInt("titulo")
                title.setText(titulo)
                information.setText(info)
            }
        } else {
            var info = savedInstanceState.getSerializable("info") as Int
            var titulo = savedInstanceState.getSerializable("titulo") as Int
            title.setText(titulo)
            information.setText(info)
        }


        comentar.setOnClickListener(){
            val toast = Toast.makeText(applicationContext, comentario.text, Toast.LENGTH_LONG)
            toast.show()
            finish()
        }
    }
}
