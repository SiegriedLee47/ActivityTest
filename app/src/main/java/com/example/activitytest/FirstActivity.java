package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Siegfried on 2/20/2016.
 */
public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.first_layout);
    }
}
