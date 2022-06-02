package com.example.piechartapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Name input
        val chartNameInput = findViewById<EditText>(R.id.getChartName)
        val chartNameText = chartNameInput.text

        // Field and Values 1
        val field1Input = findViewById<EditText>(R.id.field1)
        val field1Text = field1Input.text

        val value1Input = findViewById<EditText>(R.id.value1)
        val value1Text = value1Input.text

        // Field and Values 2
        val field2Input = findViewById<EditText>(R.id.field2)
        val field2Text = field2Input.text

        val value2Input = findViewById<EditText>(R.id.value2)
        val value2Text = value2Input.text

        // Field and Values 3
        val field3Input = findViewById<EditText>(R.id.field3)
        val field3Text = field3Input.text

        val value3Input = findViewById<EditText>(R.id.value3)
        val value3Text = value3Input.text

        // Field and Values 4
        val field4Input = findViewById<EditText>(R.id.field4)
        val field4Text = field4Input.text

        val value4Input = findViewById<EditText>(R.id.value4)
        val value4Text = value4Input.text

        val debugView = findViewById<TextView>(R.id.debugView)

        val createChartButton = findViewById<Button>(R.id.createChartButton)
        createChartButton.setOnClickListener {

        //REMOVE THIS
        debugView.text = chartNameText

        val Intent = Intent(this, PieChartActivity::class.java)
        Intent.putExtra("chartNameText", chartNameText.toString())

        Intent.putExtra("field1Text", field1Text.toString())
        Intent.putExtra("value1Text", field1Text.toString())

        Intent.putExtra("field2Text", field2Text.toString())
        Intent.putExtra("value1Text", field1Text.toString())

        Intent.putExtra("field3Text", field3Text.toString())
        Intent.putExtra("value1Text", field1Text.toString())

        Intent.putExtra("field4Text", field4Text.toString())
        Intent.putExtra("value1Text", field1Text.toString())


        startActivity(Intent)

        }
    }

    fun toInteger(editableNum: Editable): Int {
        val intNum: Int  = editableNum.getText().toString().toInt()

        return intNum
    }

}