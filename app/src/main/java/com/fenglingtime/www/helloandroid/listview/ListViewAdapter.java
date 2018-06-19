package com.fenglingtime.www.helloandroid.listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fenglingtime.www.helloandroid.R;

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;

    public ListViewAdapter(Context context) {
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
        ViewHolder holder = null;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.activity_list_view_item, null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.imageView1);
            holder.textView1 = view.findViewById(R.id.textView1);
            holder.textView2 = view.findViewById(R.id.textView2);
            holder.textView3 = view.findViewById(R.id.textView3);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.textView1.setText("这是标题");
        holder.textView1.setText("2018-5-21");
        holder.textView1.setText("这是内容");
        Glide.with(context).load("https://www.baidu.com/img/bd_logo1.png?where=super").into(holder.imageView);
        return view;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView textView1, textView2, textView3;

    }
}
