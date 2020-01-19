package edu.singaporetech.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

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

        Log.d(TAG, "onCreate")
        Log.d(TAG, createEmailMessage("Jeannie", "Los Angeles"))
    }

    /**
     * Call an intent to start the email app
     */
    fun sendEmail() { // do you need to change the parameters?

        // TODO: Use an intent to launch an email app.
        // TODO call createEmailMessage to generate the email message
        // TODO call startActivity(intent);
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