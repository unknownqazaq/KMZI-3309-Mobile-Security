package com.example.lab3_zhanserik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab3_zhanserik.databinding.ActivitySecondBinding

class SecondPage : AppCompatActivity() {
    lateinit var bind : ActivitySecondBinding
    private lateinit var edit_id : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bind.root)

    }
    // Здесь создается кнопка которая сравнивает айди который ты ввела с айди которые находятся в константах(MainStrings.kt)
    // дегеннин ишинде Names деген объектта, барлык аттар бар, сравнивает с ними, если совпадает то он берет параметр edit_id или
    // же айдишку которая ты ввела и переходит на активити FourthActivity где уже будет показано инфа про чела с этим айди
    fun onClickSearch(view: View) {
        edit_id = bind.edId.text.toString()
        // Я использовал when для простоты, тип когда айди такой, он ишет данные или же case с этим айди, и переходит
        // на активити номер 4(FourthActivity) c этим айдишкой, ну when это как switch - case
        when (edit_id.toInt()) {
//            Names.Kuanysh_Omarov -> { NextActivity(edit_id)}
            Names.Aripzhan_Parviz -> { NextActivity(edit_id)}
            Names.Daniya_Ashimova -> { NextActivity(edit_id)}
            Names.Balzhan_Bakbergenova -> { NextActivity(edit_id)}
            Names.Arailym_Bekasyl -> { NextActivity(edit_id)}
            Names.Aisha_Berkinkyzy -> { NextActivity(edit_id)}
            Names.Mirlan_Daiyn -> { NextActivity(edit_id)}
            Names.Erkhan_Djoldasov -> { NextActivity(edit_id)}
            Names.Nurzhan_Zhilisbayev -> { NextActivity(edit_id)}
            Names.Meirambek_Imash -> { NextActivity(edit_id)}
            Names.Alikhan_Mutalyap -> { NextActivity(edit_id)}
            Names.Ruslan_Mukhituly -> { NextActivity(edit_id)}
            Names.Daniyar_Nurpeissov -> { NextActivity(edit_id)}
            Names.Kuanysh_Omarov -> { NextActivity(edit_id)}
            Names.Zhanserik_Rakhmetuly -> { NextActivity(edit_id)}
            Names.Dastan_Smagul -> { NextActivity(edit_id)}
            Names.Aigerim_Sultangazy -> { NextActivity(edit_id)}
            Names.Zhadiger_Tailakbayev -> { NextActivity(edit_id)}
            Names.Erkebulan_Toktaev -> { NextActivity(edit_id)}
            Names.Dulat_Umbetay -> { NextActivity(edit_id)}
            Names.Adilmurat_Shayakhmet -> { NextActivity(edit_id)}
        }
    }

    // Это функция переходит на активити (FourthActivity) с параметром которой ты ввела
    fun NextActivity(id : String){
        val iii = Intent(this, FourthPage::class.java)
        // Здесь ключ нужен для того чтобы передать данные по этому ключу и написав этот ключ в активити(FourthActivity),
        // получить данные(айдишку которую ты ввела)
        iii.putExtra(MainStrings.key, id)
        startActivity(iii)
    }
    // Здесь создается кнопка, которая просто переходит на активити(ThirdActivity) где находиться список нашей группы
    fun onClickAllList(view: View){
        val iii = Intent(this, ThirdPage::class.java)
        startActivity(iii)
    }
}