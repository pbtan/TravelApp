package edu.singaporetech.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * Activity that displays UI to convert temperature
 */
class TempConverterActivity : AppCompatActivity() {

    val TAG: String = "TempConverter"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp_converter)

        // TODO findviewbyid for the UI elements

        // TODO set onClickListeners to all the buttons here
        //  or declare the onclick method within the layout XML?

    }

    // TODO - Implement the temperature conversion logic and other behavior here
    //  What methods do you need?

    /**
     * Converts fahrenheit to celsius
     * @param fahrenheit temperature in f
     * @return
     */
    private fun convertFahrenheitToCelsius(fahrenheit: Float): Float {
        // TODO What's the formula you need?

        return 0.0F
    }

    /**
     * Converts celsius to fahrenheit
     * @param celsius temperature in c
     * @return
     */
    fun convertCelsiusToFahrenheit(celsius: Float): Float {
        // TODO What's the formula you need?

        return 0.0F
    }

}