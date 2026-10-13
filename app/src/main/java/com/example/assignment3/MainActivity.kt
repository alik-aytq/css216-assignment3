package com.example.assignment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContent{
            MaterialTheme{
                Surface{
                    GreetingScreen()
                }
            }
        }
    }
}

@Composable
fun GreetingScreen(){
    Column(
        modifier=Modifier.padding(24.dp)
    ){
        Text(text="Hello android")
        Text(text="Assignment3")
        Text(text="Learning Jetpack Compose")
    }
}