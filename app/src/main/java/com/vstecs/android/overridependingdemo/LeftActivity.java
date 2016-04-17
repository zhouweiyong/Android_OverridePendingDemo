package com.vstecs.android.overridependingdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/11
 * class description:请输入类描述
 */
public class LeftActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return TransitionMode.LEFT;
    }
}
