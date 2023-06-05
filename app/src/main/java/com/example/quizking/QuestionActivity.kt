package com.example.quizking

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.quizking.databinding.ActivityQuestionBinding
import kotlin.math.log
import com.example.quizking.SetData.getQuestion

 class QuestionActivity : AppCompatActivity() {
     private lateinit var binding: ActivityQuestionBinding
     private var currentPosition:Int=1
    private var questionList:ArrayList<QuestionData>?=null
     private var selectOption:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityQuestionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        SetData.getQuestion()
        questionList = SetData.getQuestion()
        getQuestion()
        binding.opt1.setOnClickListener {
            selectedOptionStyle(binding.opt1,1)
        }
        binding.opt2.setOnClickListener {
            selectedOptionStyle(binding.opt2,2)
        }
        binding.opt3.setOnClickListener {
            selectedOptionStyle(binding.opt3,3)
        }
        binding.opt4.setOnClickListener {
            selectedOptionStyle(binding.opt4,4)
        }

    }

     private fun selectedOptionStyle(opt1: TextView, opt: Int) {

     }

 }