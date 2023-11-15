package com.example.latihan1

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan1.databinding.ActivityLoginLinearBinding


class LoginActivity: AppCompatActivity() {
    lateinit var binding: ActivityLoginLinearBinding
    lateinit var email: String
    lateinit var password: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_linear)
        binding = ActivityLoginLinearBinding.inflate(layoutInflater)
        Log.d("PRINT-LOG", "1")
        Log.d("PRINT-LOG", "2")

        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            email = binding.etEmail.text.toString()
            password = binding.etPassword.text.toString()
            Log.d("PRINT-LOG", email)

            if (isValidate(email, password)) {
                Toast.makeText( applicationContext, "Email atau password masih kosong", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext,"Sukses Anda sudah memasukan Email dan Password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun isValidate(email: String, password: String): Boolean{
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            return false
        } else {
            return true
        }
    }
}
