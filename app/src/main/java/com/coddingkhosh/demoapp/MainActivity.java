package com.coddingkhosh.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
   // private int progr = 0;
    private TextView textView;
    private static final String TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressInit();
        textView = findViewById(R.id.materialTextView);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "run: ");
              textView.setText(String.valueOf(progressBar.getProgress()));
            }
        },100);

    }

    private void progressInit(){
     progressBar = findViewById(R.id.progress_bar);
   //  progressBar.setProgress(progr);
    }
}
