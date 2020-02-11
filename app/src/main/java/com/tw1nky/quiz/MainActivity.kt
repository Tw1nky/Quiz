package com.tw1nky.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener {
            val intent = Intent(this,QuestionActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnExit.setOnClickListener {
            finish()
        }
    }
}
