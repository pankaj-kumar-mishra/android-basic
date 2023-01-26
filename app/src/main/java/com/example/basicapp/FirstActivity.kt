package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//import android.widget.Button
//import android.widget.TextView
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        setTitle("First App")

//  (JAVA way)
//    val displayText = findViewById(R.id.display) as TextView
//    val updateBtn = findViewById(R.id.update) as Button
//    val resetBtn = findViewById(R.id.reset) as Button
//
//    updateBtn.setOnClickListener{
//        displayText.text = "Good Bye Pankaj"
//    }
//    resetBtn.setOnClickListener{
//        displayText.text = "Welcome Back Pankaj"
//    }
//  (Kotlin way)
        btnUpdate.setOnClickListener{
            txtShow.text = "Good Bye Pankaj (PKM)"
        }
        btnReset.setOnClickListener{
            txtShow.text = "Welcome Back Pankaj (PKM)"
        }
    }
}