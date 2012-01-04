package com.olivierguillet.android.scrolldemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.olivierguillet.android.scrolldemo.R;
import com.olivierguillet.android.scrolldemo.widget.MyWebViewClient;

public class WebViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_view);
        
        WebView engine = (WebView) findViewById(R.id.webview);
        
        engine.loadUrl("file:///android_asset/scrollview.html");    
        engine.getSettings().setJavaScriptEnabled(true);
        engine.getSettings().setSaveFormData(true);
        engine.getSettings().setBuiltInZoomControls(true);
        engine.setWebViewClient(new MyWebViewClient());
    }
           
}