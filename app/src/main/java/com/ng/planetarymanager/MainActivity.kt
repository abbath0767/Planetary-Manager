package com.ng.planetarymanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val commonMessage: String = getPlatformNameValue()
        findViewById<TextView>(R.id.test_text_view).text = "Text from common: $commonMessage"
    }
}
