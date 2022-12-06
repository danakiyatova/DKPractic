package com.example.dkapp

import android.view.Gravity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class ExercisesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises)



    }

    fun modylOneOnClick(view: View) {
        val intent = Intent(this@ExercisesActivity, ModulOneActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun modylTwoOnClick(view: View) {
        val intent = Intent(this@ExercisesActivity, ModulTwoActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun backOnClick2(view: View) {
        val intent = Intent(this@ExercisesActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    var k = 0


}


