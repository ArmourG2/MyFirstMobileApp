package com.example.myfirstmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                StudentApp()
            }
        }
    }
}

@Composable
fun StudentApp() {
    var isInfoVisible by remember { mutableStateOf(false) }

    val studentName = "Akmal Irfan Bin Abdul Muqsith"
    val studentId = "AM2412018161"
    val programme = "CC101"
    val course = "Computer Science"
    val favouriteApp = "Github"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = "My First Mobile App",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                isInfoVisible = !isInfoVisible
            }
        ) {

            Text(if (isInfoVisible) "Hide Information" else "Show Information")
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (isInfoVisible) {
            Text(text = "Student Name: $studentName")
            Text(text = "Student ID: $studentId")
            Text(text = "Programme: $programme")
            Text(text = "Course: $course")
            Text(text = "Favourite Mobile App: $favouriteApp")
        } else {
            Text(text = "Click the button to see Information")
        }
    }
}