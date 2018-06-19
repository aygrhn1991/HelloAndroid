package com.fenglingtime.www.helloandroid.recyclerview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.Toast;

import com.fenglingtime.www.helloandroid.R;

public class HorRecyclerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycler);
        recyclerView = findViewById(R.id.recyclerView1);
        LinearLayoutManager manager=new LinearLayoutManager(HorRecyclerActivity.this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new HorRecyclerActivity.MyDecoration());
        recyclerView.setAdapter(new HorAdapter(HorRecyclerActivity.this, new HorAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(HorRecyclerActivity.this,"点击了"+position,Toast.LENGTH_SHORT).show();
            }
        }));
    }
    class MyDecoration extends RecyclerView.ItemDecoration {

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0, 0,  getResources().getDimensionPixelOffset(R.dimen.dividerHeight),0);
        }
    }
}
