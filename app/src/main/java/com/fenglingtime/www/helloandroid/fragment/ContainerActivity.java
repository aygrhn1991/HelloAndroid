package com.fenglingtime.www.helloandroid.fragment;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fenglingtime.www.helloandroid.R;

public class ContainerActivity extends AppCompatActivity implements AFragment.IOnMessageClick {

    private AFragment af;
    private BFragment bf;
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

//        btn = findViewById(R.id.btn_change);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (bf == null) {
//                    bf = new BFragment();
//                }
//                getFragmentManager().beginTransaction().replace(R.id.fl_container, bf).commitAllowingStateLoss();
//            }
//        });

        tv=findViewById(R.id.tv_title);
        af =AFragment.newInstance("参数");
        getFragmentManager().beginTransaction().add(R.id.fl_container, af,"a").commitAllowingStateLoss();
    }

    public void setData(String text){
        tv.setText(text);
    }

    @Override
    public void onClick(String text) {
        tv.setText(text);
    }
}
