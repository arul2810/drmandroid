package com.arul2810.disasterriskmanagement

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_regepass.*

class regepass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regepass)

         val PICK_IMAGE_REQUEST = 71
         //var filePath: Uri? = null
         //var firebaseStore: FirebaseStorage? = null
         //var storageReference: StorageReference? = null


            fun applyprocess() {
            val Name = name.text.toString()
            val Aadhaar = aadhaar.text.toString()
            val Purpose = purpose.text.toString()

            if (Name.isEmpty() || Aadhaar.isEmpty() || Purpose.isEmpty()) {
                Toast.makeText(this, "Please Fill All The Fields", Toast.LENGTH_SHORT).show()
                return
            }

                uploadproof.setOnClickListener {
                val proofuploadimage = Intent()
                    proofuploadimage.type = "image/*"
                    proofuploadimage.action = Intent.ACTION_GET_CONTENT
                    startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST)
                }

        applyepass.setOnClickListener {
            applyprocess()
        }


        }

    }
}


