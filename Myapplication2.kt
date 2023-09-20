package com.example.my_application


import android.widget.ImageView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Myapplication2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myapplication2)
        // Assuming you have an ImageView with the id "myImageView" in your layout XML.
        val imageView = findViewById<ImageView>(R.id.myImageView)

        // Set the background drawable to the "simple_gradient" drawable resource.
        imageView.setBackgroundResource(R.drawable.simple_gradient)
    }
}