package com.example.secondapp;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class UserViewModel extends AndroidViewModel {
    private userDao userDao;
    private AppDatabase userDB;

    public UserViewModel(@NonNull Application application) {
        super(application);


        userDB=AppDatabase.getAppDatabase(application);
        userDao=userDB.userDao();

    }
    public void insert(User user){
        new InsertAsyncTask(userDao).execute(user);
    }
    private class InsertAsyncTask extends AsyncTask<User,Void,Void>{
        userDao muserDao;
        public InsertAsyncTask(userDao muserDao){
            this.muserDao=muserDao;
        }

        @Override
        protected Void doInBackground(User... users) {
            return null;
        }
    }
}

