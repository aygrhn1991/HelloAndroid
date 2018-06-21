package com.fenglingtime.www.helloandroid.jump;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fenglingtime.www.helloandroid.R;

public class AActivity extends AppCompatActivity {
    private Button btnJump;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(AActivity.this, data.getExtras().getString("back"), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        btnJump = findViewById(R.id.btn_jumb);
        btnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显式1
                Intent intent = new Intent(AActivity.this, BActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", "tom");
                bundle.putInt("num", 88);
                intent.putExtras(bundle);
                //startActivity(intent);
                startActivityForResult(intent, 1000);


//                //显式2
//                Intent intent = new Intent();
//                intent.setClass(AActivity.this, BActivity.class);
//                startActivity(intent);
//                //显式3
//                Intent intent = new Intent();
//                intent.setClassName(AActivity.this,"com.fenglingtime.www.helloandroid.jump.BActivity");
//                startActivity(intent);
//                //显式3
//                Intent intent = new Intent();
//                intent.setComponent(new ComponentName(AActivity.this, "com.fenglingtime.www.helloandroid.jump.BActivity"));
//                startActivity(intent);
//                //隐式
//                Intent intent = new Intent();
//                intent.setAction("com.fl.jump.b");
//                startActivity(intent);
            }
        });
    }
}
