package com.fenglingtime.www.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

public class PopupWindowActivity extends AppCompatActivity {
    private Button mBtnPos;
    private PopupWindow mPop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);
        mBtnPos = findViewById(R.id.pop);
        mBtnPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View v = getLayoutInflater().inflate(R.layout.layout_pop, null);
                mPop = new PopupWindow(v, mBtnPos.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                mPop.showAsDropDown(mBtnPos);
            }
        });
    }

}
