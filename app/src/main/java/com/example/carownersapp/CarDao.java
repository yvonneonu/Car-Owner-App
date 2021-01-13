package com.example.carownersapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CarDao {
    @Query("SELECT * FROM carowners")
    LiveData<List<CarOwners>> getAllOwner();

    @Insert
    void insert (CarOwners carOwners);

    @Delete
    void delete (CarOwners carOwners);

    @Update
    void update(CarOwners carOwners);

}
