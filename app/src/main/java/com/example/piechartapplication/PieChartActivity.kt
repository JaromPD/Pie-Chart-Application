package com.example.piechartapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PieChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        // Get the name
        val chartNameString: String? = intent.getStringExtra("chartNameText")
        // Get the first field and value info.
        val field1String: String? = intent.getStringExtra("field1String")
        val value1String: String? = intent.getStringExtra("value1String")
        // Get the second field and value info.
        val field2String: String? = intent.getStringExtra("field2String")
        val value2String: String? = intent.getStringExtra("value2String")
        // Get the third field and value info.
        val field3String: String? = intent.getStringExtra("field3String")
        val value3String: String? = intent.getStringExtra("value3String")
        // Get the fourth field and value info.
        val field4String: String? = intent.getStringExtra("field4String")
        val value4String: String? = intent.getStringExtra("value4String")

        val chartNameOutput = findViewById<TextView>(R.id.chartName)

        val debugView1 = findViewById<TextView>(R.id.debug1)
        val debugView2 = findViewById<TextView>(R.id.debug2)
        val debugView3 = findViewById<TextView>(R.id.debug3)
        val debugView4 = findViewById<TextView>(R.id.debug4)
        val debugView5 = findViewById<TextView>(R.id.debug5)
        val debugView6 = findViewById<TextView>(R.id.debug6)
        val debugView7 = findViewById<TextView>(R.id.debug7)
        val debugView8 = findViewById<TextView>(R.id.debug8)

        chartNameOutput.text = chartNameString

        debugView1.text = field1String
        debugView2.text = value1String
        debugView3.text = field2String
        debugView4.text = value2String
        debugView5.text = field3String
        debugView6.text = value3String
        debugView7.text = field4String
        debugView8.text = value4String
    }
}