package com.adilegungor.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val user = intent.getParcelableExtra<User>("user")

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val ageTextView = findViewById<TextView>(R.id.ageTextView)

        if (user != null) {
            nameTextView.text = "Ad: ${user.name}"
            ageTextView.text = "Yaş: ${user.age}"
        }
    }
}

