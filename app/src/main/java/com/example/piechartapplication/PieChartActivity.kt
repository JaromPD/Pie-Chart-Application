package com.example.piechartapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PieChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        val chartNameString: String? = intent.getStringExtra("chartNameText")
        val chartNameOutput = findViewById<TextView>(R.id.chartName)

        chartNameOutput.text = chartNameString
    }
}