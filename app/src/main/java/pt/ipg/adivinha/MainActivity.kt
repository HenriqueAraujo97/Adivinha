package pt.ipg.adivinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun adivinhaNumero(view: View) {

        val editTextNumero =  findViewById<EditText>(R.id.editTextNumero)
        val numero = editTextNumero.text.toString()
    }
}
