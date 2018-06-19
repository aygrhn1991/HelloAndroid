package com.fenglingtime.www.helloandroid.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fenglingtime.www.helloandroid.R;

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    public GridViewAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        GridViewAdapter.ViewHolder holder = null;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.activity_grid_view_item, null);
            holder = new GridViewAdapter.ViewHolder();
            holder.imageView = view.findViewById(R.id.imageView1);
            holder.textView = view.findViewById(R.id.textView1);
            view.setTag(holder);
        } else {
            holder = (GridViewAdapter.ViewHolder) view.getTag();
        }
        holder.textView.setText("这是标题");
        Glide.with(context).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(holder.imageView);
        return view;
    }
    static class ViewHolder {
        public ImageView imageView;
        public TextView textView;

    }
}
