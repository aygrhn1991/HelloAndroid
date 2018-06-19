package com.fenglingtime.www.helloandroid.recyclerview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.fenglingtime.www.helloandroid.R;

public class PuRecyclerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler);
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.addItemDecoration(new MyDecoration());
        recyclerView.setAdapter(new PuAdapter(PuRecyclerActivity.this, new PuAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(PuRecyclerActivity.this, "点击了" + position, Toast.LENGTH_SHORT).show();
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration {

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelOffset(R.dimen.dividerHeight);
            outRect.set(gap, gap, gap, gap);
        }
    }
}
