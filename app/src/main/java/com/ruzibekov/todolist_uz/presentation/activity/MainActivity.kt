package com.ruzibekov.todolist_uz.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruzibekov.todolist_uz.R
import com.ruzibekov.todolist_uz.presentation.fragments.FocusModeFragment

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

    }

}