package com.fenglingtime.www.helloandroid.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.text.method.ReplacementTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.fenglingtime.www.helloandroid.R;

import javax.security.auth.PrivateCredentialPermission;

public class CustomDialog extends Dialog implements View.OnClickListener {
    private TextView mTvTitle, mTvMsg, mTvCancel, mTvConfirm;
    private String title, msg, cancel, confirm;
    private IOnCancelListener cancelListener;
    private IOnConfirmListener confirmListener;

    public CustomDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public CustomDialog setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public CustomDialog setCancel(String cancel, IOnCancelListener listener) {
        this.cancel = cancel;
        this.cancelListener = listener;
        return this;
    }

    public CustomDialog setConfirm(String confirm, IOnConfirmListener listener) {
        this.confirm = confirm;
        this.confirmListener = listener;
        return this;
    }

    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom_dialog);
        //设置宽度
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        Point size = new Point();
        d.getSize(size);
        p.width = (int) (size.x * 0.8);
        getWindow().setAttributes(p);

        mTvTitle = findViewById(R.id.tv_title);
        mTvMsg = findViewById(R.id.tv_msg);
        mTvCancel = findViewById(R.id.tv_cancel);
        mTvConfirm = findViewById(R.id.tv_confirm);
        if (TextUtils.isEmpty(title)) {
            mTvTitle.setText(title);
        }
        if (TextUtils.isEmpty(msg)) {
            mTvMsg.setText(msg);
        }
        if (TextUtils.isEmpty(cancel)) {
            mTvCancel.setText(cancel);
        }
        if (TextUtils.isEmpty(confirm)) {
            mTvConfirm.setText(confirm);
        }
        mTvCancel.setOnClickListener(this);
        mTvConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_cancel:
                if (cancelListener != null) {
                    cancelListener.onCancel(this);
                }
                break;
            case R.id.tv_confirm:
                if (confirmListener != null) {
                    confirmListener.onConfirm(this);
                }
                break;
        }
    }

    public interface IOnCancelListener {
        void onCancel(CustomDialog dialog);
    }

    public interface IOnConfirmListener {
        void onConfirm(CustomDialog dialog);
    }
}
