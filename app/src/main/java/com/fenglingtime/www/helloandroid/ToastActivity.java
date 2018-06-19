package com.fenglingtime.www.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fenglingtime.www.helloandroid.util.ToastUtil;

public class ToastActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        OnClick onClick=new OnClick();
        button1.setOnClickListener(onClick);
        button2.setOnClickListener(onClick);
        button3.setOnClickListener(onClick);
        button4.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.button1:
                    Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button2:
                    Toast toastCenter=Toast.makeText(getApplicationContext(),"center", Toast.LENGTH_SHORT);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                    break;
                case R.id.button3:
                    Toast toastCustom =new Toast(getApplicationContext());
                    LayoutInflater lif=LayoutInflater.from(ToastActivity.this);
                    View view=lif.inflate(R.layout.layout_toast,null);
                    ImageView imageView=view.findViewById(R.id.iv_toast);
                    TextView textView=view.findViewById(R.id.tv_toast);
                    imageView.setImageResource(R.drawable.ic_https_black_24dp);
                    textView.setText("imgToast");
                    toastCustom.setView(view);
                    toastCustom.show();
                    break;
                case R.id.button4:
                    ToastUtil.showMsg(getApplicationContext(),"util");
                    break;
            }
        }
    }
}
