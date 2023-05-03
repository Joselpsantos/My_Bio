package pt.ipt.dama.mybio

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find the button and some action
        val button = findViewById<Button>(R.id.nickNameBtn)

        button.setOnClickListener {
            addNickName(it)
            button.visibility = View.GONE
        }
    }

    /**
     * read the nicknme and write it to screen and show the users cv
     */
    fun addNickName(a : View){

        //Define all the references to the objects in the view
        val editTextContent = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val textView = findViewById<TextView>(R.id.showNickNameTextView)
        val userCV = findViewById<TextView>(R.id.userCVTextView)

        textView.text = editTextContent.text

        //show and hide the elements
        userCV.visibility = View.VISIBLE
        textView.visibility = View.VISIBLE
        editTextContent.visibility = View.GONE

        //Hide the keyboard
        //With edit text view listener
        //editTextContent.onEditorAction(EditorInfo.IME_ACTION_DONE);

        //or
        //With reference to the keyboard

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(a.windowToken, 0)


    }
}