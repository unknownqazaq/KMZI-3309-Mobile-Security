package com.example.lab3_zhanserik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab3_zhanserik.databinding.ActivityFourthBinding

class FourthPage : AppCompatActivity() {
    lateinit var bind : ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(bind.root)

        // Здесь ты получаешь данные по ключу, которые передала в активити(SecondActivity)
        val id = intent.getStringExtra(MainStrings.key)
        val person = students.find { it.id == id?.toInt() }

        if (person != null) {
            bind.tvFullname.text = MainStrings.FullName + person.name
            bind.tvBirth.text = MainStrings.Birth_date + person.date
            bind.tvPhone.text = MainStrings.Phone_num + person.phoneNumber
            bind.tvEmail.text = MainStrings.Email + person.email
            bind.tvAddress.text = MainStrings.Address + MainStrings.Location
            bind.tvMaritalSt.text = MainStrings.Marital + MainStrings.Marital_Yes
        }


        // Здесь создается кнопка, которая просто переходит на активити(SecondActivity)
    }
    fun onClickBack1(view: View) {
        val iii = Intent(this, SecondPage::class.java)
        startActivity(iii)
    }
    fun onClickUpd(view: View){
        val receivedId = intent.getStringExtra(MainStrings.key)
        val person = students.find { it.id == receivedId?.toInt() }
        val iii = Intent(this, EditActivity::class.java)
        iii.putExtra(MainStrings.key, person?.id.toString())
        startActivity(iii)
    }
}