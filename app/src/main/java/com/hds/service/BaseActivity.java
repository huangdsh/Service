package com.hds.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/11/29.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        setLayout();
        initView();
        setView();
        
    }

    //数据初始化
    public void initData(){

    }
    //设置布局
    public void setLayout(){

    }
    //控件初始化
    public void initView(){

    }
    //设置控件属性
    public void setView(){

    }
    /**
     * 不传递数据的页面跳转
     * @param c  目标页面
     */
    public void startActivity(Class c){
        Intent intent=new Intent(this,c);
        startActivity(intent);
    }

    /**
     * 传递数据的页面跳转
     * @param c  目标页面
     * @param bundle 要传递的数据
     */
    public void startActivity(Class c, Bundle bundle){
        Intent intent=new Intent(this,c);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * 不带数据带动画的页面跳转
     * @param c
     */
    public void startActivity(Class c, int inId, int exitId){
        Intent intent=new Intent(this,c);
        startActivity(intent);
        overridePendingTransition(inId,exitId);

    }
    /**
     * 带数据带动画的页面跳转
     * @param c
     */
    public void startActivity(Class c, Bundle bundle, int inId, int exitId){
        Intent intent=new Intent(this,c);
        intent.putExtras(bundle);
        startActivity(intent);

        overridePendingTransition(inId,exitId);
    }


}
