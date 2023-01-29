package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
//        title = "Calculator App"
        supportActionBar?.hide()// to hide Header

        cal_equal.setOnClickListener {
            val input = cal_txtInput.text.toString()
            val expression = ExpressionBuilder(input).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if (result == longResult.toDouble()) {
                cal_txtOutput.text = longResult.toString()
            } else {
                cal_txtOutput.text = result.toString()
            }
        }

        cal_ac.setOnClickListener {
            cal_txtInput.text = ""
            cal_txtOutput.text = ""
        }

        cal_div.setOnClickListener {
            cal_txtInput.append("/")
        }

        cal_mul.setOnClickListener {
            cal_txtInput.append("*")
        }

        cal_sub.setOnClickListener {
            cal_txtInput.append("-")
        }

        cal_add.setOnClickListener {
            cal_txtInput.append("+")
        }

        cal_0.setOnClickListener {
            cal_txtInput.append("0")
        }

        cal_1.setOnClickListener {
            cal_txtInput.append("1")
        }

        cal_2.setOnClickListener {
            cal_txtInput.append("2")
        }

        cal_3.setOnClickListener {
            cal_txtInput.append("3")
        }

        cal_4.setOnClickListener {
            cal_txtInput.append("4")
        }

        cal_5.setOnClickListener {
            cal_txtInput.append("5")
        }

        cal_6.setOnClickListener {
            cal_txtInput.append("6")
        }

        cal_7.setOnClickListener {
            cal_txtInput.append("7")
        }

        cal_8.setOnClickListener {
            cal_txtInput.append("8")
        }

        cal_9.setOnClickListener {
            cal_txtInput.append("9")
        }

        cal_dot.setOnClickListener {
            cal_txtInput.append(".")
        }

        cal_lb.setOnClickListener {
            cal_txtInput.append("(")
        }

        cal_rb.setOnClickListener {
            cal_txtInput.append(")")
        }

    }
}