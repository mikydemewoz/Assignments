package com.example.lab_assignment_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    public val map = mutableMapOf<String, String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email: EditText = findViewById(R.id.editText1)
        var password: EditText = findViewById(R.id.editText2)

        var sign_in_btn: Button = findViewById(R.id.sign_in)

        val sign_in_btnListener = View.OnClickListener {
            val email_txt: String =email.text.toString().trim()
            val pass_txt: String =password.text.toString().trim()
            if (email_txt.equals("") || pass_txt.equals("")){
                Toast.makeText(this, "Please enter valid email and password", Toast.LENGTH_LONG).show()
            }else{
                if(check(email_txt,pass_txt)){
                    val intent: Intent = Intent(this, ShopingCategory::class.java)
                }else{
                    Toast.makeText(this, "Please register", Toast.LENGTH_LONG).show()
                }
            }

        }
    }

    private fun check(email: String, password: String): Boolean {
        if(map[email] != null){
            return true
        }

        return false
    }
}