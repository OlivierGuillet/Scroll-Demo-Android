package com.olivierguillet.android.scrolldemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

import com.olivierguillet.android.scrolldemo.R;
import com.olivierguillet.android.scrolldemo.utils.Constants;
import com.olivierguillet.android.scrolldemo.widget.MyWebViewClient;

public class HtmlViewActivity extends Activity {
    
    public void onCreate(Bundle savedInstanceState, String url) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.web_view);        
            initWebEngine(url);
        } catch (Exception ex) {            
            Log.e(getString(R.string.app_name), "Erreur HtmlViewActivity#onCreate", ex);
        }
    }

    public void initWebEngine(String url) {
        WebView engine = (WebView) findViewById(R.id.webview);
        
        engine.loadUrl(Constants.URL + url);
        engine.getSettings().setJavaScriptEnabled(true);
        engine.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        engine.setWebViewClient(new MyWebViewClient());        
    }
    
}