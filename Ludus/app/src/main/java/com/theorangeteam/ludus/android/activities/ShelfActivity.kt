package com.theorangeteam.ludus.android.activities

import android.os.Bundle
import android.widget.TextView

import com.theorangeteam.ludus.R

import butterknife.ButterKnife
import butterknife.bindView

class ShelfActivity : DrawerActivity() {

    val hello: TextView by bindView(R.id.hello)

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_activity_shelf)
        ButterKnife.bind(this)
        hello!!.text = "Inheritance intensifies"
        this.setupDrawerLayout()
    }
}
