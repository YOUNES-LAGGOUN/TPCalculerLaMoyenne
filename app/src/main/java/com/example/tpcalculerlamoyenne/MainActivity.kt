package com.example.tpcalculerlamoyenne

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input20 = findViewById<EditText>(R.id.input20)
        val input40 = findViewById<EditText>(R.id.input40)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)
        val resultView = findViewById<TextView>(R.id.resultView)

        buttonCalculate.setOnClickListener {
            val exam = input20.text.toString().toInt()
            val control = input40.text.toString().toInt()

            val moyenne = ((exam*2) + control) / 3

            resultView.text = "La moyenne $moyenne"
        }
    }
}
