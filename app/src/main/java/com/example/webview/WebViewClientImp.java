package com.example.webview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewClientImp extends WebViewClient {

    private Activity activity = null;

    public WebViewClientImp (Activity activity) {
        this.activity = activity;

    }


    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        if(url.contains("lelivros.love")) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }
}
