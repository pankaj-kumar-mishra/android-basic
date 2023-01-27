package com.example.basicapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_age_calculator.*
import java.util.Calendar

class AgeCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_calculator)

        setTitle("Age Calculator App")
        Toast.makeText(this, "WELCOME TO AGE CALCULATOR", Toast.LENGTH_SHORT).show()

        btnDOB.setOnClickListener { view ->
            printAge(view)
        }
    }

    fun printAge(view: View) {
        val currCal = Calendar.getInstance()
        val year = currCal.get(Calendar.YEAR)
        val month = currCal.get(Calendar.MONTH)
        val day = currCal.get(Calendar.DAY_OF_MONTH)
        Toast.makeText(this, "Today Date: $day/${month + 1}/$year", Toast.LENGTH_LONG).show()

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, yyyy, mm, dd ->
                val selectedDate = "$dd/${mm + 1}/$yyyy"
                txtDOB.text = selectedDate

                val dobCal = Calendar.getInstance()
                dobCal.set(yyyy, mm, dd)//set the DOB date

                var age = currCal.get(Calendar.YEAR) - dobCal.get(Calendar.YEAR)
                if (currCal.get(Calendar.DAY_OF_YEAR) < dobCal.get(Calendar.DAY_OF_YEAR)) {
                    age--
                }
                txtAge.text = age.toString()
            },
            year,
            month,
            day
        ).show()
    }
}