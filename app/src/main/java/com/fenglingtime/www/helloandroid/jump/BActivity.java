package com.fenglingtime.www.helloandroid.jump;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fenglingtime.www.helloandroid.R;

import java.awt.font.TextAttribute;
import java.nio.channels.InterruptedByTimeoutException;

public class BActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        textView = findViewById(R.id.tv_content);
        button = findViewById(R.id.btn_back);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        int num = bundle.getInt("num");

        textView.setText(name + num);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                Bundle bundle1=new Bundle();
                bundle1.putString("back","backdata");
                intent.putExtras(bundle1);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
