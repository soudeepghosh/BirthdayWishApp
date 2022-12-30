package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

//import com.example.birthdaywish.R.id.nameInput

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        //val name = nameInput.toString()
        val intent = Intent(this,BirthdayWishActivity::class.java)
        intent.putExtra(BirthdayWishActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}