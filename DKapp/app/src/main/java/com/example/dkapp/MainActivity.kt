package com.example.dkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun exerciseLayoutOnClick(view: View) {
        val intent = Intent(this@MainActivity, ExercisesActivity::class.java)
        startActivity(intent)
        finish()

    }

}