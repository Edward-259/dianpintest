package com.example.yjw.myapplication.unil;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.yjw.myapplication.constant.Constant;

public class SPUtil {
    SharedPreferences sp;
    public SPUtil(String name,Context context) {
        sp = context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }

    public SPUtil(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean isFirst() {
        return sp.getBoolean(Constant.FIRST,true);
    }

    public void setFirst(boolean flag) {
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(Constant.FIRST, false);
        editor.commit();
    }
}
