package com.example.chatbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class educhat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_educhat)
        val mywebview = findViewById<WebView>(R.id.webview1)
        val settings = mywebview.settings
        settings.javaScriptEnabled = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        mywebview.loadUrl("https://console.dialogflow.com/api-client/demo/embedded/10937e53-5f56-489d-b21e-ec3b33d43c8a")
    }
}