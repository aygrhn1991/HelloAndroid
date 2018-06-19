package com.fenglingtime.www.helloandroid;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView textView5;
    private TextView textView6;
    private TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        textView5 = (TextView) findViewById(R.id.textView5);
        textView5.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        textView5.getPaint().setAntiAlias(true);

        textView6 = (TextView) findViewById(R.id.textView6);
        textView6.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        textView6.getPaint().setAntiAlias(true);

        textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText(Html.fromHtml("<u>天空飘来下划线</u>"));
    }
}
