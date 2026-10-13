package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement


class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        setContent{
            MaterialTheme{
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    TaskCompletedScreen()
                }
            }
        }
    }
}

@Composable
fun TaskCompletedScreen(){
    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter=painterResource(
                id=R.drawable.ic_task_completed
            ),
            contentDescription = null
        )

        Text(
            text="All tasks completed",
            fontSize =24.sp,
            fontWeight = FontWeight.Bold,
            modifier =Modifier.padding(top=24.dp)
        )

        Text(
            text="Nice work!",
            fontSize=16.sp,
            modifier=Modifier.padding(top=8.dp)
        )
    }
}

