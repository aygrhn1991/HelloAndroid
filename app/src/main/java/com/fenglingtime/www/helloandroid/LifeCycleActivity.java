package com.fenglingtime.www.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    public LifeCycleActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("lifecycle","----onCreate----");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","----onStart----");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","----onStop----");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","----onPause----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","----onResume----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","----onDestroy----");
    }
}
