package edu.singaporetech.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.content.Intent
import android.net.Uri.fromParts
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_email.*


/**
 * Activity that emails your friend with a message
 */
class EmailActivity : AppCompatActivity() {

    val TAG: String = "EmailActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        // TODO findviewbyid for the UI elements

        // TODO set onClickListeners to all the buttons here
        //  or declare the onclick method within the layout XML?

        val editTextName : EditText = findViewById(R.id.editTextName) as EditText
        val editTextEmail : EditText = findViewById(R.id.editTextEmail) as EditText
        val editTextCity : EditText = findViewById(R.id.editTextCity) as EditText

        //PREVIEW BUTTON
        val btn_preview = findViewById(R.id.PREVIEW) as Button
        // set on-click listener
        btn_preview.setOnClickListener {
            val nameInput: String = editTextName.text.toString()
            val cityInput: String = editTextCity.text.toString()
            val emailInput: String = editTextEmail.text.toString()
            result.setText(createEmailMessage(name = nameInput, city = cityInput))
        }

        //SEND EMAIL BUTTON
        val btn_email = findViewById(R.id.EMAIL) as Button
        // set on-click listener
        btn_email.setOnClickListener {
            val nameInput: String = editTextName.text.toString()
            val cityInput: String = editTextCity.text.toString()
            val emailInput: String = editTextEmail.text.toString()
            sendEmail(name = nameInput, city = cityInput, email = emailInput)
        }

        Log.d(TAG, "onCreate")
        Log.d(TAG, createEmailMessage("Jeannie", "Los Angeles"))
    }

    /**
     * Call an intent to start the email app
     */
    fun sendEmail(name: String, city: String, email:String) { // do you need to change the parameters?

        createEmailMessage(name = name, city = city)

        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:"+email) // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,"Going on vacation!")
        intent.putExtra(Intent.EXTRA_TEXT, createEmailMessage(name = name, city = city))
        startActivity(Intent.createChooser(intent, "Choose Email Client..."))
    }

    /**
     * Creates the string to send in the email message
     * @param name
     * @param city
     * @return the email message
     */
    private fun createEmailMessage(name: String, city: String): String {

        val emailMessage: String = getString(R.string.hey) + " " + name + " " + getString(R.string.im_going_to) + " " + city + "!"

        return emailMessage
    }

}