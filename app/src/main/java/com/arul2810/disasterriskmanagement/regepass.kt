package com.arul2810.disasterriskmanagement

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_regepass.*
import java.util.*

class regepass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regepass)

        val PICK_IMAGE_REQUEST = 71
        //var filePath: Uri? = null
        //var firebaseStore: FirebaseStorage? = null
        //var storageReference: StorageReference? = null

        uploadproof.setOnClickListener {
            val proofuploadimage = Intent(Intent.ACTION_PICK)
            proofuploadimage.type = "image/*"
            startActivityForResult(proofuploadimage, 0)
        }
         var selectedPhotoUri: Uri? = null
        applyepass.setOnClickListener {
            val Name = name.text.toString()
            val Aadhaar = aadhaar.text.toString()
            val Purpose = purpose.text.toString()

            if (Name.isEmpty() || Aadhaar.isEmpty() || Purpose.isEmpty()) {
                Toast.makeText(this, "Please Fill All The Fields", Toast.LENGTH_SHORT).show()
            } else {

                val filename = UUID.randomUUID().toString()
                val reef = FirebaseStorage.getInstance("/images/$filename")
                reef.putFile(selectedPhotoUri)


            }

        }
    }


         override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){

             super.onActivityResult(requestCode, resultCode, data)

            if(requestCode == 0 && resultCode == Activity.RESULT_OK && data != null)
            {
                //code to check the image
                val uri = data.data
                uploadview.setImageURI(uri)
            }
        }













    }


