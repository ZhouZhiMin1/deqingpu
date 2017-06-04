package com.bayue.deqingpu;

import android.support.v4.view.ViewCompat;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.bayue.deqingpu.base.BaseActivity;

import static com.zhy.autolayout.utils.ScreenUtils.getStatusBarHeight;

public class MainActivity extends BaseActivity {


    //zheshinan??//?//?/、/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        ViewGroup mContentView = (ViewGroup)findViewById(Window.ID_ANDROID_CONTENT);
        View statusBarView = mContentView.getChildAt(0);
        //移除假的 View
        if (statusBarView != null && statusBarView.getLayoutParams() != null && statusBarView.getLayoutParams().height ==getStatusBarHeight(this)) {
            mContentView.removeView(statusBarView);
        }
        //不预留空间
        if (mContentView.getChildAt(0) != null) {
            ViewCompat.setFitsSystemWindows(mContentView.getChildAt(0), false);
        }
        setContentView(R.layout.geren_activity_quanzi);
    }
}
