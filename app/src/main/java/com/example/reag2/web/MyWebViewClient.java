package com.example.reag2.web;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MyWebViewClient extends WebViewClient {



    ListenerFinishLoadWebView listenerFinishLoadWebView;

    public MyWebViewClient(ListenerFinishLoadWebView listenerFinishLoadWebView) {
        this.listenerFinishLoadWebView = listenerFinishLoadWebView;
    }

    interface ListenerFinishLoadWebView{
        public void FinishLoad();
    }
    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(request.getUrl().toString());
        return true;
    }

    // Для старых устройств
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        listenerFinishLoadWebView.FinishLoad();

    }




}
