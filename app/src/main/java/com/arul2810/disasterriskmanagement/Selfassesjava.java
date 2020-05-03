package com.arul2810.disasterriskmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;



public class Selfassesjava extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfassesjava);

        WebView myWebView = (WebView) findViewById(R.id.webviewjava);
        myWebView.loadUrl("https://console.dialogflow.com/api-client/demo/embedded/05f30b4a-66fc-460b-9bfc-6da3e30e9f7c");
    }
}
