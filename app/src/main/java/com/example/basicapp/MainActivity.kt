// Project package name (actual name of project)
package com.example.basicapp

// Make compatible for all android devices
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
// There are some inbuilt functions (like onCreate etc) we are using it. (ex: Math etc.)
import android.os.Bundle

// This line for all elements references
import kotlinx.android.synthetic.main.activity_main.*

// Starting/Entry path of application(MainActivity). (ex: index.js, app.js etc.)
class MainActivity : AppCompatActivity() {
// When app starts then "onCreate" function will trigger and execute all the methods inside "onCreate"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//  Render the contents in the screen (R = resources(res))
        setContentView(R.layout.activity_main)

    btnNavToFirst.setOnClickListener{
        val intent = Intent(this, FirstActivity::class.java);
        startActivity(intent)
    }
    btnNavToCounter.setOnClickListener{
        val intent = Intent(this, CounterActivity::class.java);
        startActivity(intent)
    }
    btnNavToAgeCalculator.setOnClickListener{
        val intent = Intent(this, AgeCalculatorActivity::class.java);
        startActivity(intent)
    }
    }
}