package com.example.carownersapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FilterDao {
    /*@Query("SELECT * FROM filter")
    LiveData<List<filterModel>> getAllFilter();

    @Insert
    void insert (filterModel filterModel1);

    @Delete
    void delete (filterModel filterModel1);

    @Update
    void update(filterModel filterModel1);*/
}
