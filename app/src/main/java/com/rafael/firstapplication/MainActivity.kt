package com.rafael.firstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Vincula o arquivo de layout XML a esta Activity
        setContentView(R.layout.activity_main)

        // 1. Referenciando os componentes do layout XML pelos seus IDs
        val campoEmail = findViewById<EditText>(R.id.editTextEmail)
        val campoSenha = findViewById<EditText>(R.id.editTextSenha)
        val botaoEnviar = findViewById<Button>(R.id.buttonEnviar)

        // 2. Configurando o evento de clique do botão
        botaoEnviar.setOnClickListener {
            // Obtém o texto digitado nos campos de e-mail e senha e converte para String
            val emailDigitado = campoEmail.text.toString()
            val senhaDigitada = campoSenha.text.toString()

            // Formata a mensagem com quebra de linha (\n) conforme solicitado
            val mensagem = "Email: $emailDigitado\nSenha: $senhaDigitada"

            // Exibe o Toast na tela com os dados informados
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}