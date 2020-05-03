package com.arul2810.disasterriskmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class selfassesment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selfassesment)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("https://console.dialogflow.com/api-client/demo/embedded/05f30b4a-66fc-460b-9bfc-6da3e30e9f7c")

    }
}
