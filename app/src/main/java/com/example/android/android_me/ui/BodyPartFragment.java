package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    // Fragment mus have two methods : 1. Constructor and 2. onCreaeView()

    //The construcor os needed in order to crawte an instance of the frgment class
   public BodyPartFragment(){

    }

    /**
     * Inflates the fragment layout and and sets the image resources.
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Inflate the Android-Me fragment layout.
       View rootView = inflater.inflate(R.layout.fragment_body_part,container,false);

       //Get refernce to the image View int the fragment layout.
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //Set the image resoyrce to display.
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;

    }
}
