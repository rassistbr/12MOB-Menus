package com.example.rm31675.menus;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OrientationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration config = getResources().getConfiguration();

        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            LandscapeFragment ls_fragment = new LandscapeFragment();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
        }else{
            PortraitFragment pt_fragment = new PortraitFragment();
            fragmentTransaction.replace(android.R.id.content, pt_fragment);
        }

        fragmentTransaction.commit();
        //setContentView(R.layout.activity_orientation);
    }

}
