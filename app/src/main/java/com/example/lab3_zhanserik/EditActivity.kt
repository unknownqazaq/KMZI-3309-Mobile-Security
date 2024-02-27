package com.example.lab3_zhanserik
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab3_zhanserik.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    lateinit var bind: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityEditBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }

    private var isDataChanged = false

    fun onClickCh(view: View) {
        if (!isDataChanged) {

            val fieldToChange = bind.edDataType.text.toString()
            val newValue = bind.edNewValue.text.toString()
            val receivedId = intent.getStringExtra(MainStrings.key)?.toInt()

            val student = students.find { it.id == receivedId }

            if (student != null) {
                when (fieldToChange.lowercase()) {
                    "name" -> student.name = newValue
                    "birth" -> student.date = newValue
                    "group" -> student.group = newValue
                    "phone" -> student.phoneNumber = newValue
                    "email" -> student.email = newValue
                }
                students = students.map { if (it.id == receivedId) student else it }.toMutableList()
                isDataChanged = true

            }else {
                bind.sometext.text = "You've already made changes to the data"
            }
        }
    }
    fun onClickBa(view: View){
        val intent = Intent(this, SecondPage::class.java)
        startActivity(intent)
    }
}
