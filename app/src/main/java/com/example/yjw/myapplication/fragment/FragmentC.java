package com.example.yjw.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yjw.myapplication.R;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentC extends baseFragment{
    @BindView(R.id.bt_fragmentA_skip)
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c,container,false);
        skip(textView);
        return view;
    }
}
