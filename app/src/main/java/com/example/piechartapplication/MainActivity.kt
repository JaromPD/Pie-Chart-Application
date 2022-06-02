package com.example.piechartapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chartNameInput = findViewById<EditText>(R.id.getChartName)
        val chartNameString = chartNameInput.text
        val debugView = findViewById<TextView>(R.id.debugView)

        val createChartButton = findViewById<Button>(R.id.createChartButton)
        createChartButton.setOnClickListener {

            //REMOVE THIS
            debugView.text = chartNameString

            val Intent = Intent(this, PieChartActivity::class.java)
            Intent.putExtra("chartNameString", chartNameString)
            startActivity(Intent)

        }
    }
}