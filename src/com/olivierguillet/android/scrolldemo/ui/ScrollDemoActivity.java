package com.olivierguillet.android.scrolldemo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.olivierguillet.android.scrolldemo.R;

public class ScrollDemoActivity extends Activity {
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        
        DashboardClickListener dBClickListener = new DashboardClickListener();
        findViewById(R.id.natif).setOnClickListener(dBClickListener);
        findViewById(R.id.hybride).setOnClickListener(dBClickListener);
        findViewById(R.id.html5).setOnClickListener(dBClickListener);        
        findViewById(R.id.iscroll4).setOnClickListener(dBClickListener);
        findViewById(R.id.scrollability).setOnClickListener(dBClickListener);
        findViewById(R.id.touchscroll).setOnClickListener(dBClickListener);        
    }        
    
    private class DashboardClickListener implements OnClickListener {
        
        private Intent intent;
        
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.natif:
                    intent = new Intent(ScrollDemoActivity.this, ListViewActivity.class);                     
                    break;
                case R.id.hybride:
                    intent = new Intent(ScrollDemoActivity.this, WebViewActivity.class);                    
                    break;
                case R.id.html5:
                    intent = new Intent(ScrollDemoActivity.this, Html5Activity.class);                   
                    break;                          
                case R.id.iscroll4:
                    intent = new Intent(ScrollDemoActivity.this, IScrollActivity.class);                    
                    break;
                case R.id.scrollability:
                    intent = new Intent(ScrollDemoActivity.this, ScrollabilityActivity.class);
                    break;                          
                case R.id.touchscroll:
                    intent = new Intent(ScrollDemoActivity.this, TouchScrollActivity.class);                    
                    break;                
                default:
                    Toast.makeText(ScrollDemoActivity.this, "Not yet implemented", Toast.LENGTH_SHORT).show();
                    break;
            }
            startActivity(intent);
        }
    }        
   
}