package com.example.carownersapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class CarViewModel extends AndroidViewModel {
    LiveData<List<CarOwners>> ListCar;
    MyCarRepo myCarRepo;

    public CarViewModel(Application application) {
        super(application);
        myCarRepo = MyCarRepo.getMyCarRepoInstance(application);
    }
}
