package bgy.com.fenghuangjinfuapp.utils;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import bgy.com.fenghuangjinfuapp.FHJFApp;

/**
 * Created by dennis on 2017-3-30.
 */

public class ConfigUtil {
    private final String TAG = this.getClass().getSimpleName();

    public static String getAssetsValue(String key) {
        String value = "";
        AssetManager am = FHJFApp.getInstance().getAssets();
        Properties props = new Properties();
        InputStream in = null;
        try {
            in = am.open("application.properties");
            props.load(in);
            // 输出属性文件中的信息
            value = props.getProperty(key);
            LogUtil.I("获取的值" + value);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    LogUtil.E(ex.getMessage());
                }
            }
        }
        return value;
    }
}
