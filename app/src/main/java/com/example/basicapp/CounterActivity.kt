package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        setTitle("Counter App")

    var count = 0;

    btnPlus.setOnClickListener{
        count++;
        txtCount.text = count.toString();
    }
    btnMinus.setOnClickListener{
        if (count>0) {
            count--;
            txtCount.text = count.toString()
        }
    }
    }
}