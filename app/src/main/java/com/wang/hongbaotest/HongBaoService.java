package com.wang.hongbaotest;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class HongBaoService extends AccessibilityService {

    private final String TAG = getClass().getName();

    public static HongBaoService mService;

    //初始化
    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Utils.toast("O(∩_∩)O~~\r\n红包锁定中...");
        Utils.log("红包锁定中...");
        mService = this;
    }

    //实现辅助功能
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Utils.log("进入 实现辅助功能 方法");
        Utils.log(event.getAction());
        Utils.log(event.getPackageName());
    }

    @Override
    public void onInterrupt() {
        Utils.toast("(；′⌒`)\r\n红包功能被迫中断");
        Utils.log("红包功能被迫中断");
        mService = null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Utils.toast("%>_<%\r\n红包功能已关闭");
        Utils.log("红包功能已关闭");
        mService = null;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 公共方法
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 辅助功能是否启动
     */
    public static boolean isStart() {
        return mService != null;
    }
}