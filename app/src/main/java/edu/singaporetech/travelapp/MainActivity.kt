package edu.singaporetech.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Lab 02: Travel App
 * Main Screen
 */
class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_temp = findViewById(R.id.button) as Button
        // set on-click listener
        btn_temp.setOnClickListener {
            val intent = Intent(this, TempConverterActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        // get reference to button
        val btn_curr = findViewById(R.id.CURRENCY) as Button
        // set on-click listener
        btn_curr.setOnClickListener {
            val intent = Intent(this, CurrencyConverterActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        // get reference to button
        val btn_email = findViewById(R.id.EMAIL) as Button
        // set on-click listener
        btn_email.setOnClickListener {
            val intent = Intent(this, EmailActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
