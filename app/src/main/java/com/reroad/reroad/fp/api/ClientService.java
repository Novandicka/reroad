package com.reroad.reroad.fp.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ClientService {
    @FormUrlEncoded
    @POST("auth/login")
    Call<ResponseBody> login(@Field("email") String username,
                             @Field("password") String password);

    @POST("auth/logout")
    Call<ResponseBody> logout();


    @GET("user/{nim}")
    Call<ResponseBody> user(@Path("id_user") String nim);
}
