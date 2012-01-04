package com.olivierguillet.android.scrolldemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.olivierguillet.android.scrolldemo.R;
import com.olivierguillet.android.scrolldemo.utils.Constants;
import com.olivierguillet.android.scrolldemo.widget.MyWebViewClient;

public class HtmlViewActivity extends Activity {
    
    public void onCreate(Bundle savedInstanceState, String url) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
        
        initWebEngine(url);
    }

    public void initWebEngine(String url) {
        WebView engine = (WebView) findViewById(R.id.webview);
        
        engine.loadUrl(Constants.url + url);
        engine.getSettings().setJavaScriptEnabled(true);
        engine.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        engine.setWebViewClient(new MyWebViewClient());        
    }
    
}