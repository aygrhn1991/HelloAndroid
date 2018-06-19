package com.fenglingtime.www.helloandroid.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fenglingtime.www.helloandroid.R;

public class PuAdapter extends RecyclerView.Adapter<PuAdapter.LinearViewHolder> {
    private Context context;
    private OnItemClickListener listener;

    public PuAdapter(Context context, OnItemClickListener listener) {
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PuAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_pu_recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PuAdapter.LinearViewHolder holder, final int position) {
        if (position % 2 == 1) {
            holder.imageView.setImageResource(R.drawable.img1);
        } else {
            holder.imageView.setImageResource(R.drawable.img2);
        }
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,"点击了"+position,Toast.LENGTH_SHORT).show();
                listener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView1);
        }
    }

    public interface OnItemClickListener {
        void onClick(int position);
    }
}
