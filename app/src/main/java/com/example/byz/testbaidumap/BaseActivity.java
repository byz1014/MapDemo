package com.example.byz.testbaidumap;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

/**
 * Created by byz on 2017/11/14.
 */

public class BaseActivity extends FragmentActivity {

    public void onToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
