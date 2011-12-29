package com.olivierguillet.android.scrolldemo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.olivierguillet.android.scrolldemo.R;

public class ScrollDemoActivity extends Activity {
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        
        //attach event handler to dashboard buttons
        DashboardClickListener dBClickListener = new DashboardClickListener();
        findViewById(R.id.natif).setOnClickListener(dBClickListener);
        findViewById(R.id.hybride).setOnClickListener(dBClickListener);
        findViewById(R.id.iscroll4).setOnClickListener(dBClickListener);
        findViewById(R.id.html5).setOnClickListener(dBClickListener);
    }        
    
    private class DashboardClickListener implements OnClickListener {
        
        private Intent intent;
        
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.natif:
                    // On met en place le passage entre les deux activités sur ce Listener
                    intent = new Intent(ScrollDemoActivity.this, ListViewActivity.class);
                    startActivity(intent);                     
                    break;
                case R.id.hybride:
                    // On met en place le passage entre les deux activités sur ce Listener
                    intent = new Intent(ScrollDemoActivity.this, WebViewActivity.class);
                    startActivity(intent);                     
                    break;
                case R.id.iscroll4:
                    // On met en place le passage entre les deux activités sur ce Listener
                    intent = new Intent(ScrollDemoActivity.this, IScrollViewActivity.class);
                    startActivity(intent);                     
                    break;
                case R.id.html5:
                    // On met en place le passage entre les deux activités sur ce Listener
                    intent = new Intent(ScrollDemoActivity.this, Html5ViewActivity.class);
                    startActivity(intent);                     
                    break;                      
                default:
                    Toast.makeText(ScrollDemoActivity.this, "Not yet implemented", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }        
   
}