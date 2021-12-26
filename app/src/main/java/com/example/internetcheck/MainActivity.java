package com.example.internetcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        google = (Button) findViewById(R.id.button);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (new InternetCheckingClass(getApplicationContext()).isConnectingToInternet()) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));
                } else {
                    Snackbar snackbar = Snackbar.make(view, "Network is Not Connected Check Your InternetConnection", Snackbar.LENGTH_LONG);
                    snackbar.show();
                }
            }
        });

    }
}