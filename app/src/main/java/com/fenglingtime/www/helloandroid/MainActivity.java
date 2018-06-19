package com.fenglingtime.www.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTextView = (Button) findViewById(R.id.button1);

        MainActivity.OnClick onClick =new MainActivity.OnClick();
        mBtnTextView.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.button1:
                    intent = new Intent(MainActivity.this, UiActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
