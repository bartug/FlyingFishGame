package com.bask.balkoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            @Override
            public void run()
            {
               try
               {
                   sleep(5000);
                }
               catch (Exception e)
               {
                   e.printStackTrace();
               }
               finally
               {
                   Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(mainIntent);
               }
            }
        };
        thread.start();
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1285295181757267/2176288118");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}
