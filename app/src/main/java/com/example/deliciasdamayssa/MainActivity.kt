package com.example.deliciasdamayssa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btndoce1 : Button
    lateinit var btndoce2 : Button
    lateinit var btndoce3 : Button
    lateinit var btndoce4 : Button
    lateinit var btndoce5 : Button
    lateinit var btndoce6 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btndoce1 = findViewById(R.id.BtnVerMaisDoce1)
        btndoce1.setOnClickListener { val navegarSaibaMais = Intent(this,TelaDeDoces::class.java)
            startActivity(navegarSaibaMais) }
        btndoce2 = findViewById(R.id.BtnVerMaisDoce2)
        btndoce2.setOnClickListener { val navegarSaibaMais = Intent(this,TelaDeDoces::class.java)
            startActivity(navegarSaibaMais) }
        btndoce3 = findViewById(R.id.BtnVerMaisDoce3)
        btndoce3.setOnClickListener { val navegarSaibaMais = Intent(this,TelaDeDoces::class.java)
            startActivity(navegarSaibaMais) }
        btndoce4 = findViewById(R.id.BtnVerMaisDoce4)
        btndoce4.setOnClickListener { val navegarSaibaMais = Intent(this,TelaDeDoces::class.java)
            startActivity(navegarSaibaMais) }
        btndoce5 = findViewById(R.id.BtnVerMaisDoce5)
        btndoce5.setOnClickListener { val navegarSaibaMais = Intent(this,TelaDeDoces::class.java)
            startActivity(navegarSaibaMais) }
        btndoce6 = findViewById(R.id.BtnVerMaisDoce6)
        btndoce6.setOnClickListener { val navegarSaibaMais = Intent(this,TelaDeDoces::class.java)
            startActivity(navegarSaibaMais) }
    }
}