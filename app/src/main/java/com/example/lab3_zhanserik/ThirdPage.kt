package com.example.lab3_zhanserik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab3_zhanserik.databinding.ActivityThirdBinding

class ThirdPage : AppCompatActivity() {
    lateinit var bind : ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(bind.root)

        // Это переменная с именани нашей группы
        var result ="Emill Amiruldayev\n" + "Parviz Aripzhan\n" + "Ashimova Daniya\n" + "Bakbergenova Balzhan\n" +
                "Bekasyl Arailym\n" + "Berkinkyzy Aisha\n" + "Daiyn Mirlan\n" + "Djoldasov Erkhan\n" +
                "Zhilisbayev Nurzhan\n" + "Imash Meirambek\n" + "Mutalyap Alikhan\n" + "Mukhituly Ruslan\n" +
                "Nurpeissov Daniyar\n" + "Omarov Kuanysh\n" + "Rakhmetuly Zhanserik\n" + "Smagul Dastan\n" +
                "Sultangazy Aigerim\n" + "Tailakbayev Zhadiger\n" + "Toktaev Erkebulan\n" + "Umbetay Gulat\n" +
                "Shayakhmet Adilmurat";
        // Здесь ты выводишь список в экран
        bind.tvAllList.text = result
    }

    // Здесь создается кнопка, которая просто переходит на активити(SecondActivity)
    fun onClickBack(view: View){
        val iii = Intent(this, SecondPage::class.java)
        startActivity(iii)
    }
}