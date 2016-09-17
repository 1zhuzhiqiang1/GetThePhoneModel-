package com.zzq.getthephonemodel;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2016/8/15 0015.
 */
public class EMUIUtils {

    private static boolean isEMUI = false;
    private static final String KEY = "ro.build.hw_emui_api_level";

    public static boolean isEMUI() {
        // Finals 2016-6-14 如果获取过了就不用再获取了，因为读取配置文件很慢
//        if (level > 0) {
//            return level;
//        }
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        isEMUI = prop.getProperty(KEY, null) != null;
        return isEMUI;
    }
}
