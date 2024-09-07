package com.example.deliciasdamayssa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.core.text.HtmlCompat

class TelaDeDoces : AppCompatActivity() {
    lateinit var btnmembros : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_doces)
        val textView = findViewById<TextView>(R.id.linkInstagram)
        textView.text = HtmlCompat.fromHtml(
            "<a href='https://www.instagram.com/delicias_da_mayssa/'>@delicias_da_mayssa</a>",
            HtmlCompat.FROM_HTML_MODE_LEGACY
        )
        textView.movementMethod = LinkMovementMethod.getInstance()
        btnmembros = findViewById(R.id.vejaMembros)
        btnmembros.setOnClickListener { val navegarSaibaMais = Intent(this,Membros::class.java)
            startActivity(navegarSaibaMais) }
    }
}