package com.example.dkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ModulTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modul_two)

        val chpic1 = ChosePic_1()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain2, chpic1)
            commit()}
    }

    fun backOnClick(view: View) {
        val intent = Intent(this@ModulTwoActivity, ExercisesActivity::class.java)
        startActivity(intent)
        finish()
    }


    fun picright1(view: View) {
        val chpic2 = ChosePic_2()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain2, chpic2)
            commit()
        }
    }
    fun falsepic1(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic2(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic3(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun picright2(view: View) {
        val chpic3 = ChosePic_3()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain2, chpic3)
            commit()
        }
    }
    fun falsepic4(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic5(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic6(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun picright3(view: View) {
        val chpic4 = ChosePic_4()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain2, chpic4)
            commit()
        }
    }
    fun falsepic7(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic8(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic9(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun picright4(view: View) {
        val chpic5 = ChosePic_5()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain2, chpic5)
            commit()
        }
    }
    fun falsepic10(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic11(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic12(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun picright5(view: View) {
        val chpic6 = Word_6()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutMain2, chpic6)
            commit()

        }
    }
    fun falsepic13(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic14(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
    fun falsepic15(view: View) {
        Toast.makeText(this@ModulTwoActivity, "Неправильно.\nПопробуй еще!!", Toast.LENGTH_SHORT).show()
    }
}
