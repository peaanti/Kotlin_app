package com.example.kotlinapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val userName = findViewById<TextView>(R.id.username)
        val returnButton = findViewById<ImageView>(R.id.return_button)
        val repoName = findViewById<TextView>(R.id.repo_name)
        val language = findViewById<TextView>(R.id.repo_lang)
        val description = findViewById<TextView>(R.id.repo_desc)
        val repoName2 = findViewById<TextView>(R.id.repo_name2)
        val language2 = findViewById<TextView>(R.id.repo_lang2)
        val description2 = findViewById<TextView>(R.id.repo_desc2)

        userName.setText(intent.getStringExtra("github_name").toString())
        repoName.setText(intent.getStringExtra("repo_name").toString())
        language.setText(intent.getStringExtra("repo_lang").toString())
        description.setText(intent.getStringExtra("repo_desc").toString())
        repoName2.setText(intent.getStringExtra("repo_name2").toString())
        language2.setText(intent.getStringExtra("repo_lang2").toString())
        description2.setText(intent.getStringExtra("repo_desc2").toString())


        returnButton.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}