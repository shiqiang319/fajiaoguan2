package com.example.fajiaoguan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //采用选项卡完成tab页面
        TabHost tabHost= (TabHost) findViewById(android.R.id.tabhost);  //获取tabhost对象
        tabHost.setup();    //对组件进行初始化
        // 为tabhost对象添加标签页
        LayoutInflater inflater=LayoutInflater.from(this);   //声明并实例化一个LayoutInflater对象
        //通过LayoutInflater对象加载五个标签页的布局文件
        inflater.inflate(R.layout.tab1,tabHost.getTabContentView());
        inflater.inflate(R.layout.tab2,tabHost.getTabContentView());
        inflater.inflate(R.layout.tab3,tabHost.getTabContentView());
        inflater.inflate(R.layout.tab4,tabHost.getTabContentView());
        inflater.inflate(R.layout.tab5,tabHost.getTabContentView());
        //添加五个标签页
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("自动").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("手动").setContent(R.id.tab2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("状态").setContent(R.id.tab3));
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator("设置").setContent(R.id.tab4));
        tabHost.addTab(tabHost.newTabSpec("tab5").setIndicator("系统").setContent(R.id.tab5));
    }
}
