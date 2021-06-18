
package com.appsnipp.education.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.appsnipp.education.R;
import com.appsnipp.education.ui.adapter.DiscoverCourseAdapter;
import com.appsnipp.education.ui.model.MatchCourse;

import java.util.Arrays;
import java.util.List;

public class Discover extends Fragment {

    RecyclerView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        return inflater.inflate(R.layout.dicover_course, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView= view.findViewById(R.id.discover_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DiscoverCourseAdapter discoverCourseAdapter = new DiscoverCourseAdapter(getContext(),getData());
        recyclerView.setAdapter(discoverCourseAdapter);
    }

    public List<MatchCourse> getData() {
        return Arrays.asList(

                new MatchCourse(1, "Three-Lettered Words", "Lets learn some THREE lettered words!!", R.drawable.three, R.drawable.tiger),
                new MatchCourse(2, "Four-Lettered Words", "Lets learn some FOUR lettered words!!", R.drawable.four, R.drawable.elephant),
                new MatchCourse(3, "Five-Lettered Words", "Lets learn some FIVE lettered words!!", R.drawable.five, R.drawable.monkey),
                new MatchCourse(4, "Six-Lettered Words", "Lets learn some SIX lettered words!!", R.drawable.six_new, R.drawable.giraffe)


        );
    }
}
