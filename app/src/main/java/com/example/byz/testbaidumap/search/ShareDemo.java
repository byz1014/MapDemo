package com.example.byz.testbaidumap.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.byz.testbaidumap.BaseActivity;
import com.example.byz.testbaidumap.R;


public class ShareDemo extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_demo);
        onToast(this.getClass().getName());
    }

    public void startShareDemo(View view) {
        Intent intent = new Intent();
        intent.setClass(this, ShareDemoActivity.class);
        startActivity(intent);

    }

}
