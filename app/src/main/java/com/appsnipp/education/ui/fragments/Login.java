/*
 * Copyright (c) 2021. rogergcc
 */

package com.appsnipp.education.ui.fragments;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.appsnipp.education.Musical_Instruments;
import com.appsnipp.education.Musical_Letters;
import com.appsnipp.education.R;

public class Login extends Fragment {

    private static final String TAG = "TAGG";
    CardView cmain1;
    CardView cmain2;

    public Login() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cmain1 = view.findViewById(R.id.cmainact1);
        cmain2 = view.findViewById(R.id.cmainact2);

        cmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(getContext(), Musical_Instruments.class);


                Log.d(TAG, "onClick: cardmainactivity1 clicked");

                startActivity(i);
            }
        });
        cmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;

                i = new Intent(getContext(), Musical_Letters.class);

                Log.d(TAG, "onClick: cardmainactivity2 clicked");

                startActivity(i);

            }
        });

    }
/*    public void onClickCard(View v) {
        Intent i;


        switch (v.getId()){
            case (R.id.cmainact1):

                i = new Intent(getContext(), Musical_Instruments.class);


                Log.d(TAG, "onClick: cardmainactivity1 clicked");

                startActivity(i);
                //finish();


                break;
            case (R.id.cmainact2):

                i = new Intent(getContext(), Musical_Letters.class);

                Log.d(TAG, "onClick: cardmainactivity2 clicked");

                startActivity(i);



                break;
            default:break;

        }



    }*/
}
