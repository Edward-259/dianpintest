package com.example.yjw.myapplication.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.yjw.myapplication.ui.MainActivity;

import butterknife.OnClick;

public class baseFragment extends Fragment {

    @OnClick
    public void skip(View view) {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();

    }
}
