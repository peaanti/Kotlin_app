package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView2 = findViewById<CardView>(R.id.cardView2)
        val cardView = findViewById<CardView>(R.id.cardView)
        val userName1 = findViewById<TextView>(R.id.github_name_1)
        val repos1 = findViewById<TextView>(R.id.github_repos_1)
        val userName2 = findViewById<TextView>(R.id.github_name_2)
        val repos2 = findViewById<TextView>(R.id.github_repos_2)

        data class Repository(val name: String, val description: String, val lang: String, val userName: String)
        data class User(val name: String, val repositories: List<Repository>)

        val reposForUser1 = listOf(
            Repository(name = "HelloWorld", description = "I'll be a next Hokage of this programming world", lang = "Kotlin", userName = "User2"),
            Repository(name = "Cells", description = "I have got a new arm", lang = "Cobol", userName = "User1")
        )
        val reposForUser2 = listOf(
            Repository(name = "OldKey", description = "I want to know what are this cellar contains", lang = "Kotlin", userName = "User1"),
            Repository(name = "Sea", description = "I'll kill all titans and go to the sea, witch contains salt", lang = "Java", userName = "User2")
        )

        val User1 = User(name = "CoolUser225", repositories = reposForUser1)
        val User2 = User(name = "Smart monke", repositories = reposForUser2)

        userName1.setText(User1.name)
        repos1.setText("${reposForUser1.size} repositories")
        userName2.setText(User2.name)
        repos2.setText("${reposForUser2.size} repositories")

        cardView2.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("github_name", User1.name)
            intent.putExtra("repo_name", reposForUser1[0].name)
            intent.putExtra("repo_lang", reposForUser1[0].lang)
            intent.putExtra("repo_desc", reposForUser1[0].description)
            intent.putExtra("repo_name2", reposForUser1[1].name)
            intent.putExtra("repo_lang2", reposForUser1[1].lang)
            intent.putExtra("repo_desc2", reposForUser1[1].description)
            startActivity(intent)
        }

        cardView.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("github_name", User2.name)
            intent.putExtra("repo_name", reposForUser2[0].name)
            intent.putExtra("repo_lang", reposForUser2[0].lang)
            intent.putExtra("repo_desc", reposForUser2[0].description)
            intent.putExtra("repo_name2", reposForUser2[1].name)
            intent.putExtra("repo_lang2", reposForUser2[1].lang)
            intent.putExtra("repo_desc2", reposForUser2[1].description)
            startActivity(intent)
        }
    }


}