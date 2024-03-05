package com.example.lab_assignment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class ShopingCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoping_category)

        var kitchen: ImageView = findViewById(R.id.imageView1)
        var beauty: ImageView = findViewById(R.id.imageView2)
        var pet: ImageView = findViewById(R.id.imageView3)
        var toy: ImageView = findViewById(R.id.imageView4)

        kitchen.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, "Kitchen icon clicked", Toast.LENGTH_SHORT).show()
            }
        })
        beauty.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, "beauty icon clicked", Toast.LENGTH_SHORT).show()
            }
        })
        pet.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, "pet icon clicked", Toast.LENGTH_SHORT).show()
            }
        })
        toy.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, "toy icon clicked", Toast.LENGTH_SHORT).show()
            }
        })
    }
}