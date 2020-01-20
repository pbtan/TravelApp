package edu.singaporetech.travelapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Activity that displays UI to convert currency
 */
class CurrencyConverterActivity : AppCompatActivity() {

    val TAG: String = "CurrencyConverterActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_converter)


        //EditText control
        val currencyText : EditText = findViewById(R.id.editTextCurrency) as EditText
        val rateText : EditText = findViewById(R.id.editTextRate) as EditText
        val sgdText : EditText = findViewById(R.id.editTextSingDollar) as EditText


        //TextView control
        val result : TextView = findViewById(R.id.result) as TextView


        //CONVERT BUTTON
        val btn_convert = findViewById(R.id.CONVERT) as Button
        // set on-click listener
        btn_convert.setOnClickListener {
            val sgdText1: Float = sgdText.text.toString().toFloat()
            val rateText1: Float = rateText.text.toString().toFloat()
            val returnValue: Float = calculateRate(value = sgdText1, exchangeRate = rateText1)
            result.setText(sgdText.text.toString() + " SGD is " + returnValue.toString() + " " + currencyText.text.toString())
        }

    }

    /**
     * Formula to calculate the destination currency
     * @param value
     * @param exchangeRate
     * @return
     */
    private fun calculateRate(value: Float, exchangeRate: Float): Float {

        // TODO What's the formula you need?
        val value: Float = value * exchangeRate
        return value
    }

}