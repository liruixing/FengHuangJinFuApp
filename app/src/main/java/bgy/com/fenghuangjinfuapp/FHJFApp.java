package bgy.com.fenghuangjinfuapp;

import android.app.Application;

/**
 * Created by dennis on 2017-3-30.
 */

public class FHJFApp extends Application {
    private static FHJFApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        this.instance = this;
    }
    public static FHJFApp getInstance() {
        return instance;
    }
}
