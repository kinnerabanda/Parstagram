package com.codepath.kbanda.parstagram;

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
                .applicationId("RcPjbAEWjMfRmtLNVxrumiaO4XNnLjFxoJTwP9Na")
                .clientKey("W3NeH98QzwyETFd6U3WEcEVVBz6GIwPHj9ajo7xF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
