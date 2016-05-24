package com.example.slidingmenudemo;

import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

//继承
// library\src\com\jeremyfeinstein\slidingmenu\lib\app\SlidingFragmentActivity.java
public class MainActivity extends SlidingFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置左侧边栏
        setBehindContentView(R.layout.left_menu);
        //设置右侧边栏
        getSlidingMenu().setSecondaryMenu(R.layout.right_menu);

        //实例化一个slidingMenu对象
        SlidingMenu slidingMenu = getSlidingMenu();

        //显示模式
        slidingMenu.setMode(SlidingMenu.LEFT);        //左显示侧边栏
        //slidingMenu.setMode(SlidingMenu.RIGHT);        //右都显示侧边栏
        //slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);  //左右都显示侧边栏

        //全屏触摸
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        //侧边栏给屏幕剩余宽度
        slidingMenu.setBehindOffset(200);




    }
}
