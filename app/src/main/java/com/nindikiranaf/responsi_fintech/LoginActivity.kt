package com.nindikiranaf.responsi_fintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvReg = findViewById<TextView>(R.id.tvRegister)
        tvReg.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }

        val tvRec = findViewById<TextView>(R.id.tvRecovery)
        tvRec.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RecoveryActivity::class.java))
        }

        val btnLogin = findViewById<TextView>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            startActivity(Intent(this@LoginActivity, HomeActivity::class.java))
        }
    }
}