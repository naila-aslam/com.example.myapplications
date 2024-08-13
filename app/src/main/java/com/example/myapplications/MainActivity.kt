package com.example.myapplications



import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Ensure this matches your layout file name

        // Get references to the EditText and Button
        val editText: EditText = findViewById(R.id.et_a)
        val buttonShowSnackbar: Button = findViewById(R.id.button_show_snackbar)
        val mainLayout: View = findViewById(R.id.mainLayout)

        // Set a click listener on the button
        buttonShowSnackbar.setOnClickListener {
            // Get the text from the EditText
            val text = editText.text.toString()

            // Show the Snackbar with the entered text
            if (text.isNotEmpty()) {
                Snackbar.make(mainLayout, text, Snackbar.LENGTH_LONG).show()
            } else {
                Snackbar.make(mainLayout, "Please enter some text", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}
