package com.example.emir_agay3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.emir_agay3.ui.theme.Emir_agay3Theme
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Alignment
import androidx.compose.material3.Button
import androidx.compose.runtime.mutableIntStateOf


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Emir_agay3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    var count by remember { mutableIntStateOf(0) }
    var count2 by remember { mutableIntStateOf(0) }
    var count3 by remember { mutableIntStateOf(0) }
    var last by remember { mutableStateOf("None") }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "count1: $count!")
            Button(onClick = { count++; last = "Add1" }) {
                Text("Add1")
            }
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "count2: $count2!")
            Button(onClick = { count2++; last = "Add2" }) {
                Text("Add2")
            }
            Text(text = "Last button: $last")
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "count3: $count3!")
            Button(onClick = { count3++; last = "Add3" }) {
                Text("Add3")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Emir_agay3Theme {
        Greeting()
    }
}