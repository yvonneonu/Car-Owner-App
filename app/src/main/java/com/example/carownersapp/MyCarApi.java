package com.example.carownersapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyCarApi {
    String Url = "https://android-json-test-api.herokuapp.com/";

    @GET("accounts")
    Call<List<UserModel>> getCarOwners();

}
