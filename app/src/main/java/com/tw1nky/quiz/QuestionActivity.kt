package com.tw1nky.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_quiestion.*

class QuestionActivity:AppCompatActivity() {
    var rightAns = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiestion)
        var numQues = 1
        newQuestion(numQues)
        button.setOnClickListener {
            rightAns += cheakQuestion(1,numQues)
            numQues++
            newQuestion(numQues)
        }
        button2.setOnClickListener {
            rightAns += cheakQuestion(2,numQues)
            numQues++
            newQuestion(numQues)
        }
        button3.setOnClickListener {
            rightAns += cheakQuestion(3,numQues)
            numQues++
            newQuestion(numQues)
        }
    }

    private fun cheakQuestion(btn:Int,numQuest:Int):Int{
        return when (btn) {
            1 -> if (numQuest == 1)
                1
            else 0
            2 -> if (numQuest in 2..3)
                1
            else 0
            3 ->  0
            else -> 0
        }
    }

    private fun newQuestion(num:Int){
        when(num){
            1->{
                question.text = "Количество крестражей в Гарри Поттере?"
                button.text = "7"
                button2.text = "9"
                button3.text = "6"
                Picasso.get().load(R.drawable.first).into(imgQ)
            }
            2->{
                question.text = "Как звали змею Волан-де-Морта?"
                button.text = "Каа"
                button2.text = "Нагайна"
                button3.text = "Василиск"
                Picasso.get().load(R.drawable.second).into(imgQ)
            }
            3->{
                question.text = "Что из этого не является даром смерти?"
                button.text ="Мантия-невидимка"
                button2.text = "Филосовский камень"
                button3.text = "Воскрешающий камень"
                Picasso.get().load(R.drawable.third).into(imgQ)
            }
            else ->{
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("Right",rightAns.toString() )
                startActivity(intent)
                finish()
            }

        }

    }


}