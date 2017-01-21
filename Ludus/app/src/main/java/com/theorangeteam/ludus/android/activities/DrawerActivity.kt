package com.theorangeteam.ludus.android.activities

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.support.v7.widget.ViewStubCompat
import android.view.Menu
import android.view.MenuItem

import com.theorangeteam.ludus.R

import butterknife.BindView
import butterknife.OnClick
import butterknife.bindView

/**
 * Created by Joao on 1/19/2017.
 */

abstract class DrawerActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener {

    val drawerLayout: DrawerLayout by bindView(R.id.drawer_layout)
    val toolbar: Toolbar by bindView(R.id.toolbar)
    val navigationView: NavigationView by bindView(R.id.nav_view)

    override fun setContentView(@LayoutRes layoutResID: Int) {
        super.setContentView(R.layout.activity_drawer)
        inflateContent(layoutResID)
    }

    private fun inflateContent(id: Int) {
        val stub = findViewById(R.id.view_stub) as ViewStubCompat
        stub.layoutResource = id
        stub.inflate()
    }

    protected fun setupDrawerLayout() {
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout!!.addDrawerListener(toggle)
        toggle.syncState()
        navigationView!!.setNavigationItemSelectedListener(this)
    }

    @OnClick(R.id.fab)
    fun onFabClick(button: FloatingActionButton) {
        Snackbar.make(button, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
    }

    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.shelf, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
