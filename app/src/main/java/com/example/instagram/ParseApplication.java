package com.example.instagram;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wSlt7R7tFtnLXzgqbJVqT87a12NHdBd2dUBE5uhO")
                .clientKey("ClZVfUV4B45s7jUzdKNEgwHigHWde2tn7Mn5ZMvN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}