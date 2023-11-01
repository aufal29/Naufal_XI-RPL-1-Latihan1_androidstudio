package com.example.latihan1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity: AppCompatActivity() {
    lateinit var btnlogin: Button
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var email: String
    lateinit var password: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_linear)

        btnlogin = findViewById(R.id.btn_login)
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)

        btnlogin.setOnClickListener {
            email = etEmail.text.toString()
            password = etPassword.text.toString()

            if (email.isNullOrEmpty() && password.isNullOrEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Email atau password masih kosong",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Sukses Anda sudah memasukan Email dan Password",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
    }
}