package com.fenglingtime.www.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fenglingtime.www.helloandroid.widget.CustomDialog;

public class CustomDialogActivity extends AppCompatActivity {

    private Button mBtnDialog;
    //private Button mBtnDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        mBtnDialog=findViewById(R.id.btn_d1);
        mBtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog customDialog=new CustomDialog(CustomDialogActivity.this);
                customDialog.setTitle("提示").setMsg("确认删除吗？").setCancel("取消",new CustomDialog.IOnCancelListener(){
                    @Override
                    public void onCancel(CustomDialog dialog) {

                    }
                }).setConfirm("确定", new CustomDialog.IOnConfirmListener() {
                    @Override
                    public void onConfirm(CustomDialog dialog) {

                    }
                }).show();
            }
        });
    }
}
