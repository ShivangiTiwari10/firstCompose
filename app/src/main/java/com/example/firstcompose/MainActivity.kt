package com.example.firstcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text(text = "HELLO COMPOSE")
//            SayCheesy2("Jaspreet")
            TextInput()
        }
    }
}

@Preview(showBackground = true, name = "Hello msg1")
@Composable
fun SayCheesy(name: String = "Jasmin") {
    Text(text = "Hello $name", fontStyle = FontStyle.Italic, fontFamily = FontFamily.Cursive)
}

@Composable
fun SayCheesy2(name: String) {

//   1. To show Image
//    Image(
//        painter = painterResource(id = R.drawable.heart),
//        contentDescription = "Dummy Image",
//        colorFilter = ColorFilter.tint(color = Color.Green),
//        contentScale = ContentScale.Crop
//
//
//    )
//   2. To render Text
//    Text(
//        text = "Hello $name",
//        fontWeight = FontWeight.SemiBold,
//        color = Color.Blue,
//        textAlign = TextAlign.End,
//        fontSize = 25.sp,
//        maxLines = maxOf(2)
//
//    )

    //    3.To render Button
//    Button(onClick = { /*TODO*/ }, colors =ButtonDefaults.buttonColors(
//        contentColor = Color.Yellow
//    , backgroundColor = Color.LightGray
//    )) {
//        Text(text = "Hey")
//        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "Dummy button")
//
//    }

}

@Preview(showBackground = true, name = "Hello msg2", widthDp = 250, heightDp = 400)
@Composable
fun PreviewFunction() {
    SayCheesy2("Keshmeera")
}

@Preview(showBackground = true, name = "Hello msg2", widthDp = 250, heightDp = 400)
@Composable
fun PreviewFunc() {

//    4.To render TextInPut
    TextField(
        value = "this is text input layout",
        onValueChange = {},
        label = { Text(text = "Enter message") },
        placeholder = {})

}

@SuppressLint("UnrememberedMutableState")
@Composable
fun TextInput() {
    val state = remember {
        mutableStateOf("")
    }
    TextField(
        value = state.value ,
        onValueChange =
        {state.value = it
        },
        label = { Text(text = "Enter Message") },
    )
}

