package com.example.carownersapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView rV;
    ImageView imageView;
    TextView textView;
    UserAdapter myCarAdapter;
    List<UserModel> owners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        owners = new ArrayList<>();


        rV = findViewById(R.id.recyclerView);
        //imageView = findViewById(R.id.imageAvatar);
        // textView = findViewById(R.id.textFullName);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyCarApi.Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyCarApi api = retrofit.create(MyCarApi.class);

        Call<List<UserModel>> call = api.getCarOwners();

        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                owners = response.body();
                myCarAdapter = new UserAdapter(owners, MainActivity.this);
                rV.setAdapter(myCarAdapter);
                rV.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        if (myCarAdapter != null) {
            myCarAdapter.junior(new UserAdapter.MyCarAdapterListener() {
                @Override
                public void Car(int position) {
                    UserModel userModel = owners.get(position);
                    Intent intent = new Intent(MainActivity.this, CarFilter.class);
                    intent.putExtra("usermodel", userModel);
                    startActivity(intent);
                }
            });
        }
    }
}