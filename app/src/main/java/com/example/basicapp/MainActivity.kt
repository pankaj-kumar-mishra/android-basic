// Project package name (actual name of project)
package com.example.basicapp

// Make compatible for all android devices
import androidx.appcompat.app.AppCompatActivity
// There are some inbuilt functions (like onCreate etc) we are using it. (ex: Math etc.)
import android.os.Bundle

// Starting/Entry path of application(MainActivity). (ex: index.js, app.js etc.)
class MainActivity : AppCompatActivity() {
// When app starts then "onCreate" function will trigger and execute all the methods inside "onCreate"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//  Render the contents in the screen (R = resources(res))
        setContentView(R.layout.activity_main)
    }
}