package com.jukusoft.phabdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jukusoft.phabdroid.activity.login.ui.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //go to login activity
        Intent k = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(k);
    }
}
