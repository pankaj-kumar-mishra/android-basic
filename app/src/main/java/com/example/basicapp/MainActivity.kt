// Project package name (actual name of project)
package com.example.basicapp

// Make compatible for all android devices
import androidx.appcompat.app.AppCompatActivity
// There are some inbuilt functions (like onCreate etc) we are using it. (ex: Math etc.)
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// This line for all elements references
import kotlinx.android.synthetic.main.activity_main.*

// Starting/Entry path of application(MainActivity). (ex: index.js, app.js etc.)
class MainActivity : AppCompatActivity() {
// When app starts then "onCreate" function will trigger and execute all the methods inside "onCreate"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//  Render the contents in the screen (R = resources(res))
        setContentView(R.layout.activity_main)

//  find button using id and trigger onPress function
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
//    update.setOnClickListener{
//        show.text = "Good Bye Pankaj (PKM)"
//    }
//    reset.setOnClickListener{
//        show.text = "Welcome Back Pankaj (PKM)"
//    }

//   Counter App
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