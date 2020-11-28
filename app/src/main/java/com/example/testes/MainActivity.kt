package com.example.testes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var no: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2: Button = findViewById(R.id.buttonNext)
        button1.setOnClickListener {
            no++
            number.text = no.toString()
        }

        button2.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)

            intent.putExtra("ANGKA", no)

            startActivity(intent)

        }

    }

}