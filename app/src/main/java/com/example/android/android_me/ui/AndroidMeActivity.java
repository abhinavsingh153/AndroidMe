/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    //TODO (1) Create a layout file that dis[lays onr body part image named fragment_body_part.xml
        //this layout should contain a aingle imageview

    //TODO (2) Craete a neqw class called BodyPartFragment to display an image of  an Android-me body part.
        // In this class implaement an emapty constructor  and the oncreate view method.

    //TODO(3) Show the first image i the list of head images.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        //TODO(5) Craete a new BodyPartFragemnt instance and display it using the FragmentManager.

        BodyPartFragment headFragment = new BodyPartFragment();

        //Use a FragmentManger and transaction to addd the fragment to the screen.
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();
    }
}
