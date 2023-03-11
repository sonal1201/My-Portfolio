package com.button.myportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linkdin = findViewById<ImageView>(R.id.link)
        val twitter = findViewById<ImageView>(R.id.twit)
        val github = findViewById<ImageView>(R.id.git)

        linkdin.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/sonal-singh-12jan/")
            startActivity(intent)
        }

        github.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/sonal1201")
            startActivity(intent)
        }
        twitter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://twitter.com/SonalSingh1201")
            startActivity(intent)
        }







    }
}