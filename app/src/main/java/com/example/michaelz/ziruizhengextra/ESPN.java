package com.example.michaelz.ziruizhengextra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ESPN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espn);

        WebView espnView = (WebView) findViewById(R.id.webViewESPN);
        espnView.setWebViewClient(new WebViewClient());
        espnView.loadUrl("https://www.espn.com/");

    }
    /*
    public class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    */

}
