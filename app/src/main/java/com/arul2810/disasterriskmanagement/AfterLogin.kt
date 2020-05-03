package com.arul2810.disasterriskmanagement

import android.app.DownloadManager
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_after_login.*
import java.util.jar.Manifest

class AfterLogin : AppCompatActivity() {

    val henum = "104"
    val REQUEST_PHONE_CALL = 1

    private fun makecall() {
        val helplinecall = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + henum))
        startActivity(helplinecall)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)
            // code for AArogya Setu
           aarogya.setOnClickListener {
               var aarogyaaction = Intent( Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=nic.goi.aarogyasetu"))
                startActivity(aarogyaaction)
           }
           // Code for E-Pass Button

            epassbutton.setOnClickListener {
                val intent = Intent(this, EPass::class.java)
                startActivity(intent)


            }
        // Code for self assessment

        selfasses.setOnClickListener {
            val selfclick = Intent(this, selfassesment::class.java)
            startActivity(selfclick)

        }

        // DO not disturb call code
        // code for medical center
        medicalcenter.setOnClickListener {
            val medicalcentersaction = Intent(this, Medicalcenter::class.java)
            startActivity(medicalcentersaction)
        }
// code for volunteer registration
        volunteerbutton.setOnClickListener {
            val volunteeraction = Intent(this, Volunteer::class.java)
            startActivity(volunteeraction)
        }
        //code for cm relief fund
        Relieffundbutton.setOnClickListener {
            val cmaction = Intent ( Intent.ACTION_VIEW, Uri.parse("http://www.cmrf.bih.nic.in/users/home.aspx"))
            startActivity(cmaction)
        }
        //code for student support
        studentbutton.setOnClickListener {
            val studentaction = Intent(this, Studentsupport::class.java)
            startActivity(studentaction)
        }
        //code for donate stuffs
        donatematerialsbutton.setOnClickListener {
            val donatebutton = Intent ( this, Donate::class.java)
            startActivity(donatebutton)
        }
        // code for asking test
        asktestbutton.setOnClickListener {
            val asktestaction = Intent( this, Asktest::class.java)
            startActivity(asktestaction)
        }
        // Code for doctor talk
            doctortalk.setOnClickListener {
                val talkdoc = Intent(this, TalkDoctor::class.java)
                startActivity(talkdoc)

            }

        // code for migrant registration

        migrantbutton.setOnClickListener {
            val migrantaction = Intent( this, MigrantRegistration::class.java)
            startActivity(migrantaction)
        }
            // code for important information display

                information.setOnClickListener{

                    val informationintent = Intent(this, Importantinfo::class.java)
                    startActivity(informationintent)

                }




                // code for sos call
                helpline.setOnClickListener {

                    if (ActivityCompat.checkSelfPermission(
                            this,
                            android.Manifest.permission.CALL_PHONE
                        ) != PackageManager.PERMISSION_GRANTED
                    ) {
                        ActivityCompat.requestPermissions(
                            this,
                            arrayOf(android.Manifest.permission.CALL_PHONE),
                            REQUEST_PHONE_CALL
                        )
                    } else {

                        makecall()

                    }


                }

}


override fun onRequestPermissionsResult(
    requestCode: Int,
    permissions: Array<out String>,
    grantResults: IntArray
) {
    if(requestCode== REQUEST_PHONE_CALL){
        makecall()

    }
}}


