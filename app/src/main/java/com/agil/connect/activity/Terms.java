package com.agil.connect.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.agil.connect.R;


public class Terms extends AppCompatActivity {

    WebView webView;
    ImageView imageView3;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        webView = findViewById(R.id.webView);
        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(v -> onBackPressed());
        webView.requestFocus();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.setSoundEffectsEnabled(true);
        webView.loadData("<!DOCTYPE html>\n" +
                        "    <html>\n" +
                        "    <head>\n" +
                        "      <meta charset='utf-8'>\n" +
                        "      <meta name='viewport' content='width=device-width'>\n" +
                        "      <title>Terms &amp; Conditions</title>\n" +
                        "      <style> body { font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; padding:1em; } </style>\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "    <strong>Terms &amp; Conditions</strong> <p>\n" +
                        "                  By downloading or using the app, these terms will\n" +
                        "                  automatically apply to you – you should make sure therefore\n" +
                        "                  that you read them carefully before using the app. You’re not\n" +
                        "                  allowed to copy, or modify the app, any part of the app, or\n" +
                        "                  our trademarks in any way. You’re not allowed to attempt to\n" +
                        "                  extract the source code of the app, and you also shouldn’t try\n" +
                        "                  to translate the app into other languages, or make derivative\n" +
                        "                  versions. The app itself, and all the trade marks, copyright,\n" +
                        "                  database rights and other intellectual property rights related\n" +
                        "                  to it, still belong to SNDP.\n"  +
                        "                  These terms and conditions are effective as of 2022-04-04\n" +
                        "                </p> <p><strong>Contact Us</strong></p> <p>\n" +
                        "                  If you have any questions or suggestions about our\n" +
                        "                  Terms and Conditions, do not hesitate to contact us\n" +
                        "                  at guizaniaziz332@gmail.com .\n" +
                        "                </p></p>\n" +
                        "    </body>\n" +
                        "    </html>\n" +
                        "      ",
                "text/html", "UTF-8");
    }
}