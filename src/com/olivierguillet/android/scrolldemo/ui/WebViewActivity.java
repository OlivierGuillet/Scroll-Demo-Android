package com.olivierguillet.android.scrolldemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.olivierguillet.android.scrolldemo.R;

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
    
    public class MyWebViewClient extends WebViewClient {
        
        /** Shows the web page in webview but not in web browser. */    
        @Override 
        public boolean shouldOverrideUrlLoading(WebView view, String url) { 
            view.loadUrl(url);
            return true;
        }

    }    
    
}