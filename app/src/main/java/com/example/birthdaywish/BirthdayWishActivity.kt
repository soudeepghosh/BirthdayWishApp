package com.example.birthdaywish

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BirthdayWishActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish)

        val name = intent.getStringExtra(NAME_EXTRA)
        findViewById<TextView>(R.id.birthdayGreeting).text = "Happy Birthday \n $name"

    }
}