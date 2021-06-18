package com.appsnipp.education;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "TAGG";
    CardView cmain1;
    CardView cmain2;
    //public Activity a;
    //public Activity b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        cmain1 = findViewById(R.id.cmainact1);
        cmain2 = findViewById(R.id.cmainact2);
        cmain1.setOnClickListener(this);
        cmain2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;


        switch (v.getId()){
            case (R.id.cmainact1):

                i = new Intent(this, Musical_Instruments.class);


                Log.d(TAG, "onClick: cardmainactivity1 clicked");

                startActivity(i);
                //finish();


                break;
            case (R.id.cmainact2):

                i = new Intent(this,Musical_Letters.class);

                Log.d(TAG, "onClick: cardmainactivity2 clicked");

                    startActivity(i);



               break;
            default:break;

        }



    }
    //@Override
    //public void onBackPressed(){
      //  Intent i;

      //  this.finish();
     //   i = new Intent(this,MainActivity2.class) ;

      //  startActivity(i);
    //}
}