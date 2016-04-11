package com.vstecs.android.overridependingdemo;

import android.os.Bundle;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/11
 * class description:请输入类描述
 */
public class TopActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return TransitionMode.TOP;
    }
}
