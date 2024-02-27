package com.example.lab3_zhanserik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab3_zhanserik.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding

    // Здесь создается переменные для ввода айдишки и пароля
    private lateinit var edit_id: String
    private lateinit var edit_password: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

    }
    // Создается кнопка которая, считывает данные(айдишки и пароля) и если они совпадают с данными в константах,
    // то дальше заходит и переходит на активити(SecondActivity), или же если пароль или айди не найден, то выведет =
    // Incorrect name or password
    fun onClickLogIn(view: View){
        edit_id = bind.edName.text.toString()
        edit_password = bind.edPassword.text.toString()
        if((edit_id == MainStrings.LoginName && edit_password == MainStrings.LoginPassword) ||
            (edit_id == MainStrings.LoginName1 && edit_password == MainStrings.LoginPassword)){

            // Вот это часть нужна для перехода на другой активити, тип Intent(this, SecondActivity::class.java),
            // this = с этого активити, SecondActivity::class.java = на этот активити

            val iii = Intent(this, SecondPage::class.java)
            startActivity(iii)
            bind.tvError.text = ""
        }else{
            bind.tvError.text = "Incorrect name or password"
        }
    }
}