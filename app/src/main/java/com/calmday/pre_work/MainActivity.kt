package com.calmday.pre_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.toast_btn);

        button.setOnClickListener {
            showModal();
        }
    }


    fun showModal() {
        Log.v("toast_btn", "Button Clicked");
        Toast.makeText(this, "Hi Everyone. Nice to meet you", Toast.LENGTH_SHORT).show();
    }
}