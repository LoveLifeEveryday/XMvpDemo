package com.xcynice.testmvpframe.api;


import com.xcynice.testmvpframe.bean.User;
import com.xmvp.xcynice.base.XBaseBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @Author xucanyou666
 * @Date 2020/4/28 14:57
 * email：913710642@qq.com
 */
public interface LoginApi {
    //登录
    @FormUrlEncoded
    @POST("user/login")
    Observable<XBaseBean<User>> login(@Field("username") String username, @Field("password") String password);
}
