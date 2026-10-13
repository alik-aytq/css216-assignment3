package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            ComposeArticle()
        }
    }
}

@Composable
fun ComposeArticle(){
    Column{
        Image(
            painter = painterResource(
                R.drawable.bg_compose_background
            ),
            contentDescription = null,
            modifier=Modifier.fillMaxWidth()
        )

        Text(
            text="Jetpack Compose tutorial",
            fontSize=24.sp,
            modifier=Modifier.padding(16.dp)
        )

        Text(
            text="Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
            modifier=Modifier.padding(
                start = 16.dp,
                end=16.dp
            )
        )

        Text(
            text="In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions.",
            textAlign=TextAlign.Justify,
            modifier=Modifier.padding(16.dp)
        )
    }
}

