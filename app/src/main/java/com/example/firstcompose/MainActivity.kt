package com.example.firstcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Recomposable()
        }
    }


}

@Composable
fun Recomposable() {
    val state = remember { mutableStateOf(0.0) }
    Log.d("Logged", "LOGed during initial composition")

    Button(onClick = { /*TODO*/

        state.value = Math.random()

    }) {
        Log.d("Logged", "LOGed during both initial composition & Recomposition")
        Text(text = state.value.toString())
    }
}

