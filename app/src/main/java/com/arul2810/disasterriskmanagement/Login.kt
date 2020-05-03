package com.arul2810.disasterriskmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button5.setOnClickListener {
            var email = username.text.toString()
            var password = pass.text.toString()

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {

                    if(!it.isSuccessful) {
                        Toast.makeText(this, "Login Failed ! Try Again", Toast.LENGTH_SHORT).show()
                    }
                    else {

                        Toast.makeText(this, " Login Successful ", Toast.LENGTH_SHORT).show()
                        val successlogin= Intent(this,AfterLogin::class.java)
                        // Change Activity Here
                        startActivity(successlogin)

                    }
                }
        }
        button4.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java)
            // Change Activity Here for Forgot Password
            startActivity(intent)
        }
    }
}
