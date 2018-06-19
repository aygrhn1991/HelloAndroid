package com.fenglingtime.www.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fenglingtime.www.helloandroid.gridview.GridViewActivity;
import com.fenglingtime.www.helloandroid.listview.ListViewActivity;
import com.fenglingtime.www.helloandroid.recyclerview.RecyclerViewActivity;

public class UiActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnScrollView;
    private Button mBtnRecyclerView;
    private Button mBtnWebViewView;
    private Button mBtnToastView;
    private Button mBtnDialogView;
    private Button mBtnProgressView;
    private Button mBtnCustomDialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        mBtnTextView = (Button) findViewById(R.id.button1);
        mBtnButton = (Button) findViewById(R.id.button2);
        mBtnEditText = (Button) findViewById(R.id.button3);
        mBtnRadioButton = (Button) findViewById(R.id.button4);
        mBtnCheckBox = (Button) findViewById(R.id.button5);
        mBtnImageView = (Button) findViewById(R.id.button6);
        mBtnListView = (Button) findViewById(R.id.button7);
        mBtnGridView = (Button) findViewById(R.id.button8);
        mBtnScrollView = (Button) findViewById(R.id.button9);
        mBtnRecyclerView = (Button) findViewById(R.id.button10);
        mBtnWebViewView = (Button) findViewById(R.id.button11);
        mBtnToastView = (Button) findViewById(R.id.button12);
        mBtnDialogView = (Button) findViewById(R.id.button13);
        mBtnProgressView = (Button) findViewById(R.id.button14);
        mBtnCustomDialogView = (Button) findViewById(R.id.button15);

        OnClick onClick =new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnScrollView.setOnClickListener(onClick);
        mBtnRecyclerView.setOnClickListener(onClick);
        mBtnWebViewView.setOnClickListener(onClick);
        mBtnToastView.setOnClickListener(onClick);
        mBtnDialogView.setOnClickListener(onClick);
        mBtnProgressView.setOnClickListener(onClick);
        mBtnCustomDialogView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.button1:
                    intent = new Intent(UiActivity.this, TextViewActivity.class);
                    break;
                case R.id.button2:
                    intent = new Intent(UiActivity.this, ButtonActivity.class);
                    break;
                case R.id.button3:
                    intent = new Intent(UiActivity.this, EditTextActivity.class);
                    break;
                case R.id.button4:
                    intent = new Intent(UiActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.button5:
                    intent = new Intent(UiActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.button6:
                    intent = new Intent(UiActivity.this, ImageViewActivity.class);
                    break;
                case R.id.button7:
                    intent = new Intent(UiActivity.this, ListViewActivity.class);
                    break;
                case R.id.button8:
                    intent = new Intent(UiActivity.this, GridViewActivity.class);
                    break;
                case R.id.button9:
                    intent = new Intent(UiActivity.this, ScrollViewActivity.class);
                    break;
                case R.id.button10:
                    intent = new Intent(UiActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.button11:
                    intent = new Intent(UiActivity.this, WebViewActivity.class);
                    break;
                case R.id.button12:
                    intent = new Intent(UiActivity.this, ToastActivity.class);
                    break;
                case R.id.button13:
                    intent = new Intent(UiActivity.this, DialogActivity.class);
                    break;
                case R.id.button14:
                    intent = new Intent(UiActivity.this, ProgressActivity.class);
                    break;
                case R.id.button15:
                    intent = new Intent(UiActivity.this, CustomDialogActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
