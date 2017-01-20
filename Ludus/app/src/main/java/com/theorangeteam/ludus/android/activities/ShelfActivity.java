package com.theorangeteam.ludus.android.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.theorangeteam.ludus.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShelfActivity extends DrawerActivity
{

    @BindView(R.id.hello)
    TextView hello;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_shelf);
        ButterKnife.bind(this);
        hello.setText("Inheritance intensifies");
        this.setupDrawerLayout();
    }
}
