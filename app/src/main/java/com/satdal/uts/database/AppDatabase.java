package com.satdal.uts.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.satdal.uts.database.dao.DatabaseDao;
import com.satdal.uts.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}