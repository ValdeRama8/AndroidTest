package com.example.hp.wv_bkdana

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient



class homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val myWebView: WebView = findViewById(R.id.myview)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://www.bkdana.id/")
        myWebView.settings.javaScriptEnabled = true


    }
}
