package com.olivierguillet.android.scrolldemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.olivierguillet.android.scrolldemo.R;
import com.olivierguillet.android.scrolldemo.web.MyWebViewClient;

public class Html5ViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
        
        WebView engine = (WebView) findViewById(R.id.webview);
        
        engine.loadUrl("http://olivierguillet.com/blog/demo/scroll-demo/scroll.html");
        engine.getSettings().setJavaScriptEnabled(true);
        //engine.getSettings().setSaveFormData(true);
        //engine.getSettings().setBuiltInZoomControls(true);
        engine.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        
        engine.setWebViewClient(new MyWebViewClient());
    }
    
}