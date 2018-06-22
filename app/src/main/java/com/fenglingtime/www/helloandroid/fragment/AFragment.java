package com.fenglingtime.www.helloandroid.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.fenglingtime.www.helloandroid.R;

import java.security.cert.Certificate;

public class AFragment extends Fragment {
    private TextView textView;
    //private Activity activity;
    private Button btn1, btn2, btn3;
    private BFragment bf;
    private IOnMessageClick listener;

    public static AFragment newInstance(String title) {
        AFragment fragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        fragment.setArguments(bundle);
        return fragment;
    }

    public interface IOnMessageClick {
        void onClick(String text);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.tv_name1);
//        if(getActivity()!=null){
//
//        }else {
//
//        }

        btn1 = view.findViewById(R.id.btn_change);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bf == null) {
                    bf = new BFragment();
                }
                Fragment f = getFragmentManager().findFragmentByTag("a");
                if (f != null) {
                    getFragmentManager().beginTransaction().hide(f).add(R.id.fl_container, bf).addToBackStack(null).commitAllowingStateLoss();
                } else {
                    getFragmentManager().beginTransaction().replace(R.id.fl_container, bf).addToBackStack(null).commitAllowingStateLoss();
                }
            }
        });
        btn2 = view.findViewById(R.id.btn_reset);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("新文字");
            }
        });
        btn3 = view.findViewById(R.id.btn_msg);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //((ContainerActivity) getActivity()).setData("你好");
                listener.onClick("新新新文字");
            }
        });
        if (getArguments() != null) {
            textView.setText(getArguments().getString("title"));
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //activity=(Activity)context;
        try {
            listener = (IOnMessageClick) context;
        } catch (Exception e) {
            throw new ClassCastException("activity必须实现IOnMessageClick接口");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //取消异步
    }
}
