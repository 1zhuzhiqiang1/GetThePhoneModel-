package com.zzq.getthephonemodel;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_txt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        tv_txt = (TextView) findViewById(R.id.tv_txt);
    }

    private void initData() {
        int sdk = Build.VERSION.SDK_INT; // SDK号
        String model = android.os.Build.MODEL; // 手机型号
        String release = android.os.Build.VERSION.RELEASE; // android系统版本号
        tv_txt.setText("sdk:" + sdk + "\n" + "手机型号:" + model + "\n" + "系统版本号:" + release + "\n");
        tv_txt.append("HARDWARE:" + Build.HARDWARE + "\n");
        tv_txt.append("当前手机是小米手机？" + MIUIUtils.isMIUI() + "\n");
        tv_txt.append("当前手机是华为手机？" + EMUIUtils.isEMUI() + "\n");
    }
}
