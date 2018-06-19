package com.fenglingtime.www.helloandroid.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.method.ReplacementTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fenglingtime.www.helloandroid.R;

public class LinearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private OnItemClickListener listener;

    public LinearAdapter(Context context, OnItemClickListener listener) {
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new LinearViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_linear_recycler_item, parent, false));
        } else {
            return new LinearViewHolder_2(LayoutInflater.from(context).inflate(R.layout.activity_linear_recycler_item_2, parent, false));
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (getItemViewType(position) == 0) {
            ((LinearViewHolder) holder).textView.setText("ok1");
        } else {
            ((LinearViewHolder_2) holder).textView.setText("ok2");
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,"点击了"+position,Toast.LENGTH_SHORT).show();
                listener.onClick(position);
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView1);
        }
    }

    class LinearViewHolder_2 extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public LinearViewHolder_2(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView1);
        }
    }

    public interface OnItemClickListener {
        void onClick(int position);
    }
}
