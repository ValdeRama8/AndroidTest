package com.example.hp.wv_bkdana.RegisterActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.hp.wv_bkdana.R

class register_pendana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_pendana)

        val myWebView: WebView = findViewById(R.id.myview)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://www.bkdana.id/register-pendana")
        myWebView.settings.javaScriptEnabled = true
    }
}
