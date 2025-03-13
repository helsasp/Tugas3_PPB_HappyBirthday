package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        message = "Happy",
                        message2 = "Birthday",
                        message3 = "Harry!",
                        sender = "From Helsa<3",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String, message2: String, message3: String, sender: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFE4E1)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF880E4F)
        )
        Text(
            text = message2,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF880E4F)
        )
        Text(
            text = message3,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF880E4F)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = sender,
            fontSize = 40.sp,
            color = Color(0xFFD81B60)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        Greeting("Happy", "Birthday", "Harry!", "From Helsa<3")
    }
}
