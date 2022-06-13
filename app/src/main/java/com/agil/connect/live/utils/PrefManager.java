package com.agil.connect.live.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.agil.connect.live.Constants;


public class PrefManager {
    public static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
    }
}
