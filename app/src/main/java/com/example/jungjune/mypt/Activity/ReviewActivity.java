package com.example.jungjune.mypt.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jungjune.mypt.R;
import com.example.jungjune.mypt.Util.TitleBarActivity;

public class ReviewActivity extends TitleBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTitle("익명 후기");
        super.getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_review);
    }
}
