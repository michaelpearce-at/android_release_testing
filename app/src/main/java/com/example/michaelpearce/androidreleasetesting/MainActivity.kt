package com.example.michaelpearce.androidreleasetesting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewHelloWorld.text = getString(R.string.first_feature)
        Log.d("MainActivity", "First feature...")
    }
}
