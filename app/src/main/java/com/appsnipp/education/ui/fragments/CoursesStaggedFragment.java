/*
 * Copyright (c) 2020. rogergcc
 */

package com.appsnipp.education.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.appsnipp.education.PianoActivity;
import com.appsnipp.education.R;
import com.appsnipp.education.databinding.FragmentCoursesStaggedBinding;
import com.appsnipp.education.ui.adapter.CourseRecyclerAdapter;
import com.appsnipp.education.ui.listeners.CoursesItemClickListener;
import com.appsnipp.education.ui.model.CourseCard;

import java.util.ArrayList;


public class CoursesStaggedFragment extends Fragment
        implements CoursesItemClickListener {

    FragmentCoursesStaggedBinding binding;
    private Context mcontext;
    private ArrayList<CourseCard> courseCards;
    private CourseRecyclerAdapter adapter;

    public CoursesStaggedFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_courses_stagged, container, false);
        binding = FragmentCoursesStaggedBinding.inflate(getLayoutInflater());
        mcontext = this.getContext();
        View view = binding.getRoot();


        binding.edtSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                    //For this example only use seach option
                    //U can use a other view with activityresult
                    performSearch();
                    Toast.makeText(mcontext,
                            "Edt Searching Click: " +  binding.edtSearch.getText().toString().trim(),
                            Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        binding.rvCourses.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        binding.rvCourses.setClipToPadding(false);
        binding.rvCourses.setHasFixedSize(true);

        courseCards = new ArrayList<>();

        courseCards.add(new CourseCard(1, R.drawable.three, "Three Lettered Words", "10 Chapters"));
        courseCards.add(new CourseCard(2, R.drawable.four, "Four Lettered Words", "TBD"));
        courseCards.add(new CourseCard(3, R.drawable.five, "Five Lettered Words", "TBD"));
        courseCards.add(new CourseCard(4, R.drawable.six_new, "Six Lettered Words", "TBD"));


        adapter = new CourseRecyclerAdapter(mcontext, courseCards, this);

//        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.card_margin);
//        binding.rvCourses.addItemDecoration(new SpacesItemDecoration(spacingInPixels));

        binding.rvCourses.setAdapter(adapter);
        return view;
    }
    private void performSearch() {
        binding.edtSearch.clearFocus();
        InputMethodManager in = (InputMethodManager) mcontext.getSystemService(Context.INPUT_METHOD_SERVICE);
        in.hideSoftInputFromWindow( binding.edtSearch.getWindowToken(), 0);
        //...perform search
    }
    @Override
    public void onDashboardCourseClick(CourseCard courseCard, ImageView imageView,int n) {
        Toast.makeText(mcontext, courseCard.getCourseTitle(), Toast.LENGTH_LONG).show();

        n=n+3;

        Intent intent = new Intent(mcontext, PianoActivity.class);
        intent.putExtra("n",n);
        startActivityForResult(intent,2);
    }
}