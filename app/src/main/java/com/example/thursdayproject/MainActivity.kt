package com.example.thursdayproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator:Button
    lateinit var btnContacts:Button
    lateinit var btnWebsite:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculator = findViewById(R.id.btnCalculator)
        btnContacts = findViewById(R.id.btnContacts)
        btnWebsite = findViewById(R.id.btnWeb)


        btnCalculator.setOnClickListener {
            var calc = Intent(this,CalculatorActivity::class.java)
            startActivity(calc)

        }
        btnContacts.setOnClickListener {
            var contacts = Intent(this,ContactsActivity::class.java)
            startActivity(contacts)
        }
        btnWebsite.setOnClickListener {
            var web = Intent(this,WebsiteActivity::class.java)
            startActivity(web)
        }
    }

}