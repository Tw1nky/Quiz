package com.tw1nky.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val intent= intent
        result.text = intent.getStringExtra("Right")

        again.setOnClickListener {
            val intentAgain = Intent(this,QuestionActivity::class.java)
            startActivity(intentAgain)
            finish()
        }
        btnExit.setOnClickListener {
            finish()
        }
    }
}