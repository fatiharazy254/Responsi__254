package com.example.responsi_254

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {
    private lateinit var txtProses: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        txtProses = findViewById(R.id.txt_proses)

        val bundle: Bundle? = intent.extras
        var username = bundle?.get("Username").toString()
        var password = bundle?.get("Password").toString()

        txtProses.text = """
            Username : ${username}
            Password : ${password}
        """.trimIndent()

        btn_back.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
