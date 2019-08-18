package com.wang.hongbaotest;

import android.util.Log;
import android.widget.Toast;

public class Utils {

    public static void toast(CharSequence cs) {
        Toast.makeText(MyApp.mApp, cs, Toast.LENGTH_SHORT).show();
    }

    public static void log(Object obj){
        Log.i("GT_",obj.toString());
    }

}
