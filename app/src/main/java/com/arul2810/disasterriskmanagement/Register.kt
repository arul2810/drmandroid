package com.arul2810.disasterriskmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.*
import kotlin.math.log

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)



        button3.setOnClickListener {
            val email = editText.text.toString()
            val password = editText3.text.toString()
            val rpassword = editText7.text.toString()


            // Firebase Authentication Starts Here

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, " Email or Password is Empty", Toast.LENGTH_SHORT).show()

            }



            else if (!password.equals(rpassword)) {

                Toast.makeText(this, "Passwords Does Not Match", Toast.LENGTH_SHORT).show()


            } else {
                Toast.makeText(this, "Registering...",Toast.LENGTH_SHORT).show()
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener {

                        if(!it.isSuccessful)
                        {
                            Toast.makeText(this,"Password Should Have 6 Characters", Toast.LENGTH_SHORT).show()

                    }else {
                            val intent = Intent(this, Login::class.java)
                            startActivity(intent)
                        }


                    }
            }
        }
    }
}


