package com.example.firstcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Text(text = "HELLO COMPOSE")
//            SayCheesy2("Jaspreet")
//            TextInput()
//            LayoutComposable()
//            PreviewFunction()

//            CircularImage()

//            from screen class --
//            PreviewItems()
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
private fun PreviewFunction() {
//    SayCheesy2("Keshmeera")
    Column() {
        ListViewItems(R.drawable.arrow, "Ranjeeta", "Bike rider")
        ListViewItems(R.drawable.arrow, "Savita", "Singer")
        ListViewItems(R.drawable.arrow, "Babita", "technician")
        ListViewItems(R.drawable.arrow, "Rohini", "Tester")
        ListViewItems(R.drawable.arrow, "Praneeta", "professor")
        ListViewItems(R.drawable.arrow, "Anjali", "Teacher")
    }

//    CUsTOM Composable using modifier
//    Text(
//        text = "Hello", color = Color.White,
//        modifier = Modifier
//            .clickable { }
//            .background(Color.Red)
//            .size(100.dp)
//            .border(4.dp, Color.Yellow)
//            .clip(CircleShape)
//            .padding(12.dp, 11.dp)
//            .background(Color.Black)
//
//    )

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
        value = state.value,
        onValueChange =
        {
            state.value = it
        },
        label = { Text(text = "Enter Message") },
    )
}

// 5.Layout Composable

@Preview(showBackground = true, widthDp = 400, heightDp = 500)
@Composable
private fun LayoutComposable() {

//    a.COLUMN Column mimic Linear layout (arrange vertically)
// Column(
//     verticalArrangement = Arrangement.SpaceEvenly,
//     horizontalAlignment = Alignment.CenterHorizontally
// ) {
//         Text(text = "ColumnA", fontSize = 20.sp, fontFamily = FontFamily.Serif)
//         Text(text = "ColumnB", fontSize = 15.sp)
// }
//   b.ROW (arrange horizontally)
//    Row(
//        horizontalArrangement =Arrangement.SpaceAround,
//         verticalAlignment = Alignment.CenterVertically
//
//    ) {
//        Text(text = "Row1", fontSize = 20.sp, fontFamily = FontFamily.Serif)
//        Text(text = "Row2", fontSize = 15.sp)
//    }


//    c.Box (just like frame layout)
//      Box() {
//
//          Image(painter = painterResource(id = R.drawable.heart), contentDescription ="" )
//          Image(painter = painterResource(id = R.drawable.ic_baseline_arrow_outward_24), contentDescription ="" )
//      }
//
}

// 6. ListView Item
@Composable
fun ListViewItems(ImagId: Int, name: String, ocupation: String) {


    Row(Modifier.padding(8.dp)) {
        Image(painter = painterResource(id = ImagId), contentDescription = "", Modifier.size(45.dp))
        Column(
            Modifier
                .padding(8.dp)
        ) {

            Text(
                text = name, fontSize = 20.sp, fontWeight
                = FontWeight.SemiBold
            )
            Text(
                text = ocupation,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Thin
            )
        }
    }
}

@Composable
fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.bird),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray)
            .padding(5.dp)
            .shadow(8.dp),
        contentDescription = ""
    )

}