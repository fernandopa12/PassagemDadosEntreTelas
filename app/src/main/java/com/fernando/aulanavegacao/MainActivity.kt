package com.fernando.aulanavegacao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnEnviar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener{
            var intent = Intent(this,ResultadoActivity::class.java)

            //Enviado dados para outra tela
            //intent.putExtra("nomeAluno","Yago")
            var aluno1 = Aluno(
                "Yago",
                2
            )

            intent.putExtra("alunoKey",aluno1)

            startActivity(intent)

        }
    }
}