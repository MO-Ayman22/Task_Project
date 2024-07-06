package com.example.task_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.task_project.ui.theme.Task_ProjectTheme
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val logInButton: Button = findViewById(R.id.Go_login)
        val signUpButton: Button = findViewById(R.id.Go_signup)
        logInButton.setOnClickListener {
           val intent = Intent(this,login_activity::class.java)
            startActivity(intent)
        }
        signUpButton.setOnClickListener {
           val intent = Intent(this,signup_activity::class.java)
            startActivity(intent)
        }
    }
}