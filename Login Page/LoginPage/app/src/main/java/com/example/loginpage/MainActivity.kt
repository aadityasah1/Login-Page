package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //intialize the UI

        val signup = findViewById<TextView>(R.id.btn_SignUp)
        val signin = findViewById<Button>(R.id.btn_SignIn)
        signup.setOnClickListener {
            val intent = Intent(this, newpage::class.java)
            startActivity(intent)
        }
        signin.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}