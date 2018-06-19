package com.fenglingtime.www.helloandroid.gridview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.fenglingtime.www.helloandroid.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView=findViewById(R.id.gridView1);
        gridView.setAdapter(new GridViewAdapter(GridViewActivity.this));

    }
}
