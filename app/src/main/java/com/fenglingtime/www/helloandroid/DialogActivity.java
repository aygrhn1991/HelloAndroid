package com.fenglingtime.www.helloandroid;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        DialogActivity.OnClick onClick = new DialogActivity.OnClick();
        button1.setOnClickListener(onClick);
        button2.setOnClickListener(onClick);
        button3.setOnClickListener(onClick);
        button4.setOnClickListener(onClick);
        button5.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DialogActivity.this);
                    builder1.setTitle("请回答").setMessage("准备好了吗？").setIcon(R.drawable.ic_https_black_24dp).setPositiveButton("嗯呢", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(DialogActivity.this, "嗯呢？", Toast.LENGTH_SHORT).show();
                        }
                    }).setNeutralButton("一般般", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(DialogActivity.this, "一般般？", Toast.LENGTH_SHORT).show();
                        }
                    }).setNegativeButton("不咋地", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(DialogActivity.this, "不咋地？", Toast.LENGTH_SHORT).show();
                        }
                    }).show();
                    break;
                case R.id.button2:
                    final String[] sexArray2 = new String[]{"男", "女"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                    builder2.setTitle("选择性别").setItems(sexArray2, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(DialogActivity.this, sexArray2[i], Toast.LENGTH_SHORT).show();
                        }
                    }).show();
                    break;
                case R.id.button3:
                    final String[] sexArray3 = new String[]{"男", "女"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setTitle("选择性别").setSingleChoiceItems(sexArray3, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(DialogActivity.this, sexArray3[i], Toast.LENGTH_SHORT).show();
                            dialogInterface.dismiss();
                        }
                    }).setCancelable(false).show();
                    break;
                case R.id.button4:
                    final String[] sexArray4 = new String[]{"吃", "喝", "玩", "乐"};
                    final boolean[] isSelect = new boolean[]{false, false, false, true};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("选择爱好").setMultiChoiceItems(sexArray4, isSelect, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                            Toast.makeText(DialogActivity.this, sexArray4[i] + ":" + b, Toast.LENGTH_SHORT).show();
                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).setCancelable(false).show();
                    break;
                case R.id.button5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
                    View v = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog, null);
                    EditText etUserName = v.findViewById(R.id.et_username);
                    EditText etPassword = v.findViewById(R.id.et_password);
                    Button btnLogin = v.findViewById(R.id.btn_login);
                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(DialogActivity.this, "账号密码呢", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder5.setTitle("请先登陆").setView(v).show();
                    break;
            }
        }
    }
}
