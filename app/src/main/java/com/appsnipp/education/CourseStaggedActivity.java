/*
 * Copyright (c) 2020. rogergcc
 */

package com.appsnipp.education;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.appsnipp.education.ui.adapter.CourseRecyclerAdapter;
import com.appsnipp.education.ui.listeners.CoursesItemClickListener;
import com.appsnipp.education.ui.model.CourseCard;

import java.util.ArrayList;
import java.util.List;

public class CourseStaggedActivity extends AppCompatActivity
        implements CoursesItemClickListener {
    private CourseRecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private List<CourseCard> courseCards;
    private EditText edt_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_course_stagged);


        edt_search = findViewById(R.id.edt_search);
        edt_search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                    //For this example only use seach option
                    //U can use a other view with activityresult
                    performSearch();

                    Toast.makeText(CourseStaggedActivity.this,
                            "Edt Searching Click: " + edt_search.getText().toString().trim(),
                            Toast.LENGTH_SHORT).show();

                    return true;
                }
                return false;
            }
        });

        recyclerView = findViewById(R.id.rv_courses);

        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        recyclerView.setClipToPadding(false);
        recyclerView.setHasFixedSize(true);

        courseCards = new ArrayList<>();

        courseCards.add(new CourseCard(1, R.drawable.spell, "Spelling", "10 Chapters"));
        courseCards.add(new CourseCard(2, R.drawable.alphabet_image, "Alphabets", "TBD"));
        courseCards.add(new CourseCard(3, R.drawable.words, "Words", "TBD"));


        adapter = new CourseRecyclerAdapter(this, courseCards, this);

//        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.card_margin);
//        recyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));

        recyclerView.setAdapter(adapter);


    }


    private void performSearch() {
        edt_search.clearFocus();
        InputMethodManager in = (InputMethodManager) CourseStaggedActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
        in.hideSoftInputFromWindow(edt_search.getWindowToken(), 0);
        //...perform search

    }

    @Override
    public void onDashboardCourseClick(CourseCard courseCard, ImageView imageView,int n) {

        Toast.makeText(this, courseCard.getCourseTitle(), Toast.LENGTH_LONG).show();
        n=n+3;

        Intent intent = new Intent(getApplicationContext(),PianoActivity.class);
        intent.putExtra("n",n);
        startActivityForResult(intent,2);
    }


    //    https://stackoverflow.com/questions/28531996/android-recyclerview-gridlayoutmanager-column-spacing
    public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
        private int space;

        public SpacesItemDecoration(int space) {
            this.space = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view,
                                   RecyclerView parent, RecyclerView.State state) {
            outRect.left = space;
            outRect.right = space;
            outRect.bottom = space;

            // Add top margin only for the first item to avoid double space between items
            if (parent.getChildLayoutPosition(view) == 0) {
                outRect.top = space;
            } else {
                outRect.top = 0;
            }
        }
    }
}
