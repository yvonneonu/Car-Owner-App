package com.example.carownersapp;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MyCarRepo {
    private List<CarOwners> carModelss;
    private LiveData<List<CarOwners>> car;
    //private CarDao carDao;
    private static MyCarRepo myCarRepo;


    public MyCarRepo(Context context) {
        CarOwnerDatabase carOwnerDatabase = CarOwnerDatabase.carOwnerDatabaseInstance(context);
       // carDao = carOwnerDatabase.carDao();
        carModelss = new ArrayList<>();
    }

    static MyCarRepo getMyCarRepoInstance(Context context) {
        if (myCarRepo == null) {
            myCarRepo = new MyCarRepo(context);
        }
        return myCarRepo;
    }

   /*public void addTodo(CarOwners carOwners) {
        addinBackground(carOwners)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<CarOwners>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onSuccess(@NonNull List<CarOwners> carOwners) {
                        carModelss = carOwners;
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                    }
                });
    }
    public Single<List<CarOwners>> addinBackground(CarOwners carOwners) {
        return Single.fromCallable(new Callable<List<CarOwners>>() {
            @Override
            public List<CarOwners> call() throws Exception {
                carDao.insert(carOwners);
                return null;
            }
        });
    }*/

    private List<CarOwners> carOwners = new ArrayList<>();
    private void readFile(Context context) {
        //carOwnerContainer = new ArrayList<>();
        InputStream is = context.getResources().openRawResource(R.raw.car_ownsers_data);
       BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8")));
        String line = "";
        try {

            while ((line = reader.readLine()) != null) {

                String[] tokens = line.split(",");
                CarOwners owners = new CarOwners(0, "firstNmane", "", "", "", "","", "", "", "", "");

                carOwners.add(owners);

            }
        } catch (IOException e) {
            Log.wtf("Mainactivity", "Error reading data file on line" + line, e);
            e.printStackTrace();
        }
    }

}
   //
