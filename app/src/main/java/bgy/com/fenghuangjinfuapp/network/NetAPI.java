package bgy.com.fenghuangjinfuapp.network;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by dennis on 2017-3-30.
 */

public interface NetAPI {

    @FormUrlEncoded
    @POST("bjws/app.user/login")
    Observable<Object> ITFLoginPost(@Field("tel") String tel,@Field("password") String password);





}
