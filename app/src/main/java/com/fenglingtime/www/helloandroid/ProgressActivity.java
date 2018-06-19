package com.fenglingtime.www.helloandroid;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ProgressActivity extends AppCompatActivity {
    private ProgressBar progressBar3;
    private Button button, btn_p1, btn_p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        progressBar3 = findViewById(R.id.pb3);
        //progressBar3.setProgress(30);
        button = findViewById(R.id.btn_load);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.sendEmptyMessage(0);
            }
        });
        btn_p1 = findViewById(R.id.btn_progress_dialog1);
        btn_p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog pd = new ProgressDialog(ProgressActivity.this);
                pd.setTitle("提示");
                pd.setMessage("加载");
                pd.setCancelable(true);
                pd.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialogInterface) {
                        Toast.makeText(ProgressActivity.this, "cancel...", Toast.LENGTH_SHORT).show();
                    }
                });
                pd.show();
            }
        });
        btn_p2 = findViewById(R.id.btn_progress_dialog2);
        btn_p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog pd = new ProgressDialog(ProgressActivity.this);
                pd.setTitle("提示");
                pd.setMessage("加载");
                pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pd.setButton(DialogInterface.BUTTON_POSITIVE, "stop", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                pd.show();
            }
        });
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (progressBar3.getProgress() < 100) {
                handler.postDelayed(runnable, 500);
            } else {
                Toast.makeText(ProgressActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
            }
        }
    };
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            progressBar3.setProgress(progressBar3.getProgress() + 5);
            handler.sendEmptyMessage(0);
        }
    };
}
