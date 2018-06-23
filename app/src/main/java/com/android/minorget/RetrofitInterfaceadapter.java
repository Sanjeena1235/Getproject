package com.android.minorget;

import com.android.minorget.model.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by user on 6/23/2018.
 */

public interface RetrofitInterfaceadapter {

    @GET("sql-to-json.php")
    Call<List<Model>> getMenu();
}
