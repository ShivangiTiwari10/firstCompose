package com.example.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(heightDp = 500)
@Composable
fun PreviewItems() {
//    BlockComposable(R.drawable.bird, "Kavya", "Software developer")

//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCetegoryList().map { item ->
//            BlockComposable(img = item.imag, title = item.title, subtitle = item.subTitle)
//        }
//    }


// for recyclerView In JetPack Compose  we have lazy
//    Lazy Composable

    LazyColumn(content = {

        items(getCetegoryList()) { item ->
            BlockComposable(img = item.imag, title = item.title, subtitle = item.subTitle)

        }
    })

}


@Composable
fun BlockComposable(img: Int, title: String, subtitle: String) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                    .weight(2f)
            )
            itemDescription(title, subtitle, modifier = Modifier.weight(8f))
        }
    }
}

@Composable
// made reusable composable
fun itemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = title, style = MaterialTheme.typography.h6)
        Text(
            text = subtitle, style = MaterialTheme.typography.h4, fontSize = 12.sp
        )
    }
}

data class Category(val imag: Int, val title: String, val subTitle: String)

fun getCetegoryList(): MutableList<Category> {


    val list = mutableListOf<Category>()

    list.add(Category(R.drawable.bird, "Programming", "learn language"))
    list.add(Category(R.drawable.arrow, "Technology", "read article"))
    list.add(Category(R.drawable.heart, "Oops", "clear concept"))
    list.add(Category(R.drawable.bird, "Wondering", "Go to Park"))
    list.add(Category(R.drawable.bird, "Programming", "learn language"))
    list.add(Category(R.drawable.arrow, "Technology", "read article"))
    list.add(Category(R.drawable.heart, "Oops", "clear concept"))
    list.add(Category(R.drawable.heart, "Oops", "clear concept"))
    list.add(Category(R.drawable.arrow, "Technology", "read article"))
    list.add(Category(R.drawable.heart, "Oops", "clear concept"))
    list.add(Category(R.drawable.heart, "Oops", "clear concept"))
    list.add(Category(R.drawable.bird, "Wondering", "Go to Park"))
    return list
}

