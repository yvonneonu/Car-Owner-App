package com.example.carownersapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {CarOwners.class}, version = 1, exportSchema = false)

public abstract class CarOwnerDatabase extends RoomDatabase {
    public abstract CarDao carDao();
    public static CarOwnerDatabase carOwnerDatabase;

    public static CarOwnerDatabase carOwnerDatabaseInstance(Context context){
        if (carOwnerDatabase == null){

            carOwnerDatabase = Room.databaseBuilder(context,CarOwnerDatabase.class, "Data").build();
        }

        return carOwnerDatabase;
    }
}
