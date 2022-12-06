package com.example.dkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ModulOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modul_one)

        val word1 = Word_1()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain, word1)
            commit()
        }
    }

    fun backOnClick1(view: View) {
        val intent = Intent(this@ModulOneActivity, ExercisesActivity::class.java)
        startActivity(intent)
        finish()
    }



    fun rightWordClick(view: View) {
        val word2 = Word_2()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain, word2)
            commit()
    }
    }

    fun falseWord1Click(view: View) {

        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falseWord2Click(view: View) {

        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }

    fun falseWord3Click(view: View) {

        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }

    fun rightWord2Click2(view: View) {
        val word3 = Word_3()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain, word3)
            commit()
        }
    }
    fun falseWord2Click4(view: View) {
        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falseWord2Click5(view: View) {
        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falseWord2Click6(view: View) {
        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }

    fun rightWord3Click3(view: View) {
        val word4 = Word_4()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain, word4)
            commit()
        }
    }
    fun falseWord3Click7(view: View) {
        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()

    }
    fun falseWord3Click8(view: View) {
        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falseWord3Click9(view: View) {
        Toast.makeText(this@ModulOneActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }

    fun rightWord4Click4(view: View) {
        val word5 = Word_5()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain, word5)
            commit()
        }
    }
    fun rightWord5Click5(view: View) {
        val word6 = Word_6()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain, word6)
            commit()
        }
    }


}