package edu.singaporetech.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_temp_converter.*
import android.widget.RadioButton
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


/**
 * Activity that displays UI to convert temperature
 */
class TempConverterActivity : AppCompatActivity() {

    val TAG: String = "TempConverter"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp_converter)

        //EditText control
        val inputText : TextView = findViewById(R.id.editTextTemp) as TextView

        //EditText control
        val result : TextView = findViewById(R.id.result) as TextView


        // Get radio group selected item using on checked change listener
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
            })


        // convert button
        val btn_convert = findViewById(R.id.CONVERT) as Button
        // set on-click listener
        btn_convert.setOnClickListener {
            // Get the checked radio button id from radio group
            var id: Int = radio_group.checkedRadioButtonId
            if (id!=-1){ // If any radio button checked from radio gsroup
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(id)
                val selectionRadio: String = radio.text.toString()
                if(selectionRadio == "to Fahrenheit"){
                    val inputText1: Float = inputText.text.toString().toFloat()
                    val inputText2: Int? = inputText.text.toString().toInt()
                    val returnValue: Float = convertFahrenheitToCelsius(fahrenheit = inputText1)
                    result.setText(inputText2.toString() + " Celsius is " + returnValue.toString() + " Fahrenheit")
                }else{
                    val inputText1: Float = inputText.text.toString().toFloat()
                    val inputText2: Int = inputText.text.toString().toInt()
                    val returnValue: Float = convertCelsiusToFahrenheit(celsius = inputText1)
                    result.setText(inputText2.toString() + " Fahrenheit is " + returnValue.toString() + " Celsius")
                }
            }
        }

        // clear button
        val btn_clear = findViewById(R.id.CLEAR) as Button
        // set on-click listener
        btn_clear.setOnClickListener {
            inputText.setText(" ")
        }

    }

    /**
     * Converts fahrenheit to celsius
     * @param fahrenheit temperature in f
     * @return
     */
    private fun convertFahrenheitToCelsius(fahrenheit: Float): Float {
        // TODO What's the formula you need?
        val value: Float = ((fahrenheit*9)/5)+32
        return value
    }

    /**
     * Converts celsius to fahrenheit
     * @param celsius temperature in c
     * @return
     */
    fun convertCelsiusToFahrenheit(celsius: Float): Float {
        // TODO What's the formula you need?
        val value: Float = ((celsius - 32)*5)/9
        return value

    }

}