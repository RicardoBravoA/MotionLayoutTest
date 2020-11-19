package com.rba.motionlayout.test.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rba.motionlayout.test.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}