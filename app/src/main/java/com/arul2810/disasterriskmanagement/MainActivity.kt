package com.arul2810.disasterriskmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val intent1 = Intent(this, Register::class.java)
            startActivity(intent1)
            // Change of Activity to Register Page
        }
        button.setOnClickListener {
            val intent = Intent ( this, Login::class.java )
            startActivity(intent)
            // Change of Activity to Login Page
        }
    }
}
