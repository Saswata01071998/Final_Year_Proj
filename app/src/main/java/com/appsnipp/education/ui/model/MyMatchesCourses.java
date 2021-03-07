/*
 * Copyright (c) 2020. rogergcc
 */

package com.appsnipp.education.ui.model;

import android.content.Context;
import android.content.SharedPreferences;

import com.appsnipp.education.App;
import com.appsnipp.education.R;

import java.util.Arrays;
import java.util.List;


public class MyMatchesCourses {

    private static final String STORAGE = "shop";
    private SharedPreferences storage;

    private MyMatchesCourses() {
        storage = App.getInstance().getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
    }

    public static MyMatchesCourses get() {
        return new MyMatchesCourses();
    }

    public List<MatchCourse> getData() {
        return Arrays.asList(

                new MatchCourse(1, "Three-Lettered Words", "10 chapters available", R.drawable.three),
                new MatchCourse(2, "Four-Lettered Words", "TBD", R.drawable.four),
                new MatchCourse(3, "Five-Lettered Words", "TBD", R.drawable.five)


        );
    }

    public boolean isRated(int itemId) {
        return storage.getBoolean(String.valueOf(itemId), false);
    }

    public void setRated(int itemId, boolean isRated) {
        storage.edit().putBoolean(String.valueOf(itemId), isRated).apply();
    }
}
