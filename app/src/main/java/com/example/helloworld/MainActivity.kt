package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

// ':' is extend
class MainActivity : AppCompatActivity() {

    //oncreate == main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView == Create UI
        //R == resources
        setContentView(R.layout.activity_main)
        //TODO : Continue work here
        val buttonNuclearActivate : Button = findViewById(R.id.buttonNuclearActivate)
        buttonNuclearActivate.setOnClickListener{ showMessage() }
        val buttonReset : Button = findViewById(R.id.reset)
        buttonReset.setOnClickListener{ showResetMessage() }
    }

    private fun showResetMessage() {
        val textViewImage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.reset))
    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.nuclear_activate))
    }
}
