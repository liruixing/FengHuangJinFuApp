package bgy.com.fenghuangjinfuapp.utils;

import android.util.Log;

public class LogUtil {
	static boolean islog = true;
	static String tag = "FHJF";
	
	public static void D(String msg){
		if(islog)Log.d(tag, msg);
	}
	public static void E(String msg){
		if(islog)Log.e(tag, msg);
	}
	public static void I(String msg){
		if(islog)Log.i(tag, msg);
	}
}
