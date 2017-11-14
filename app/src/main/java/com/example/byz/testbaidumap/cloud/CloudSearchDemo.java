package com.example.byz.testbaidumap.cloud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.byz.testbaidumap.BaseActivity;
import com.example.byz.testbaidumap.R;


public class CloudSearchDemo extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_search_demo);
        onToast(this.getClass().getName());
    }

    public void startCloudSearchDemo(View view) {
        Intent intent = new Intent();
        intent.setClass(this, CloudSearchActivity.class);
        startActivity(intent);

    }
}
