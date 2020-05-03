package com.arul2810.disasterriskmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_e_pass.*
import kotlinx.android.synthetic.main.activity_selfassesjava.view.*

class EPass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_pass)

        myepassbutton.setOnClickListener {
            val epassaction = Intent(this,myepass::class.java)
            startActivity(epassaction)
        }

        registerepassbutton.setOnClickListener {
            val registeraction = Intent(this, regepass::class.java)
            startActivity(registeraction)
        }
    }
}
