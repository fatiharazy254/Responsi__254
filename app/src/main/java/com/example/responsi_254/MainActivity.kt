package com.example.responsi_254

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var edtUsername : EditText
    private lateinit var edtPass : EditText
    private lateinit var btnLogin : Button
    private lateinit var tvRegis : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.edt_username)
        edtPass = findViewById(R.id.edt_pass)
        btnLogin = findViewById(R.id.btn_login)
        tvRegis = findViewById(R.id.tv_regis)

        btnLogin.setOnClickListener {
            val edtUsername = edt_username.text.toString()
            val edtPass = edt_pass.text.toString()

            val username = intent.getStringExtra("username")
            val email = intent.getStringArrayExtra("email")
            val password = intent.getStringArrayExtra("password")

            if (edtUsername.isEmpty() || edtPass.isEmpty()){
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (edtUsername!="fatiharazy"){
                Toast.makeText(this, "Username salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else
                if (edtPass!="fatiha99"){
                    Toast.makeText(this, "Password salah", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

            intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("email", email)
            intent.putExtra("password", password)

            intent.putExtra("Username", edtUsername)
            intent.putExtra("Password", edtPass)
            startActivity(intent)
        }

        tvRegis.setOnClickListener{
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
    }
    }
}
