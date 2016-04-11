package com.vstecs.android.overridependingdemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/11
 * class description:请输入类描述
 */
public abstract class BaseActivity extends Activity {


    public enum TransitionMode {
        LEFT, RIGHT, TOP, BOTTOM, SCALE, FADE
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (getOverridePendingTransitionMode()!=null) {
            switch (getOverridePendingTransitionMode()) {
                case LEFT:
                    overridePendingTransition(R.anim.left_in,R.anim.left_out);
                    break;
                case RIGHT:
                    overridePendingTransition(R.anim.right_in,R.anim.right_out);
                    break;
                case TOP:
                    overridePendingTransition(R.anim.top_in,R.anim.top_out);
                    break;
                case BOTTOM:
                    overridePendingTransition(R.anim.bottom_in,R.anim.bottom_out);
                    break;
                case SCALE:
                    overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
                    break;
                case FADE:
                    overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                    break;
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override
    public void finish() {
        super.finish();
        if (getOverridePendingTransitionMode()!=null) {
            switch (getOverridePendingTransitionMode()) {
                case LEFT:
                    overridePendingTransition(R.anim.right_in,R.anim.right_out);
                    break;
                case RIGHT:
                    overridePendingTransition(R.anim.left_in,R.anim.left_out);
                    break;
                case TOP:
                    overridePendingTransition(R.anim.bottom_in,R.anim.bottom_out);
                    break;
                case BOTTOM:
                    overridePendingTransition(R.anim.top_in,R.anim.top_out);
                    break;
                case SCALE:
                    overridePendingTransition(R.anim.scale_in_disappear,R.anim.scale_out_disappear);
                    break;
                case FADE:
                    overridePendingTransition(R.anim.fade_in_disappear,R.anim.fade_out_disappear);
                    break;
            }
        }
    }

    protected abstract TransitionMode getOverridePendingTransitionMode();


}
