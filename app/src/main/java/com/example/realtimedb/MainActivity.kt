package com.example.realtimedb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val db : DatabaseReference = FirebaseDatabase.getInstance().reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addCityButton.setOnClickListener{
            db.child(cityInput.text.toString()).setValue("")
            Toast.makeText(this, "Done!", Toast.LENGTH_LONG).show()
        }


        readCitiesButton.setOnClickListener {
            startActivity(Intent(this, Cities::class.java))
        }

    }
}
