package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_btn).setOnClickListener { addNickName(it) }
    }

    private fun addNickName(view: View) {
        val editText = findViewById<EditText>(R.id.nick_name_edit)
        val nickname: TextView = findViewById(R.id.nick_name_tv)

        view.visibility = View.GONE

        nickname.text = editText.text
        editText.visibility = View.GONE
        nickname.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
