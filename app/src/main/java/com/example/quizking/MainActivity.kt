package com.example.quizking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizking.databinding.ActivityMainBinding
import com.example.quizking.ActivityMain

class ActivityMain : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGetStarted.setOnClickListener{
            val intent=Intent(this,QuestionActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
    }


