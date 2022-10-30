package com.example.taskapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskapp.ui.theme.TaskAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(

                    color = MaterialTheme.colors.background
                ) {
                    TaskComponent()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun TaskComponent(){
    val image = painterResource(R.drawable.taskapp)
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Image(painter = image, contentDescription = null
            )
        Text(text = "All tasks completed",
            fontSize = 24.sp,
            modifier=Modifier.padding(top=24.dp, bottom = 8.dp)

                    )
        Text(text = "Nice work!",
            fontSize = 16.sp,
           )


    }
}

@Composable
fun CompletionText() {
    Column {
        Text(text = "All tasks completed",
            fontSize = 24.sp,
            modifier= Modifier
               )
        Text(text = "Nice work!",
            fontSize = 16.sp,
            modifier= Modifier
                )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskAppTheme {
       TaskComponent()
    }
}