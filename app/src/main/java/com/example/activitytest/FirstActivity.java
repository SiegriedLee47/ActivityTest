package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Siegfried on 2/20/2016.
 */
public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
    }
}
