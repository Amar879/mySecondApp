package com.example.secondapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;

    @Dao
    public interface userDao{



        @Insert
        void insert(User username);

        @Delete
        void delete(User user);
    }
