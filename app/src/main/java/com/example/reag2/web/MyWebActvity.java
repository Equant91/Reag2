package com.example.reag2.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reag2.R;

public class MyWebActvity extends AppCompatActivity implements MyWebViewClient.ListenerFinishLoadWebView {
    WebView webView;
    MyWebViewClient myWebViewClient;
    TextView txProgress;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_actvity);
        txProgress = findViewById(R.id.twProgressBar);
        progressBar = findViewById(R.id.progressBar2);

        webView = findViewById(R.id.webView);
        myWebViewClient = new MyWebViewClient(this);

        webView.setWebViewClient(myWebViewClient);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://rt.pornhub.com/");


    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void FinishLoad() {
        Toast.makeText(this, "LoadFinish ", Toast.LENGTH_SHORT).show();
        webView.setVisibility(View.VISIBLE);
        txProgress.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
    }
}
