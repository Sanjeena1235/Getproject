package com.android.minorget;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 6/23/2018.
 */

public class RetrofitClient {

    public static Retrofit retrofit = null;
    public static Retrofit getRetrofit(){
        if(retrofit == null){
            retrofit =new Retrofit.Builder()
                    .baseUrl("http://192.168.43.130/minor/main_admin/")
                    .addConverterFactory(GsonConverterFactory.create())//convert json data to gson
                    .build();
        }
        return  retrofit;
    }
}
