package com.unipd.dei2026.simon


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Activity2(allMatches:String, onBackClicked:()->Unit, modifier: Modifier=Modifier){
    val matchesList= allMatches.split("|")
    LazyColumn(modifier=modifier.fillMaxSize().padding(10.dp)) {
        items(matchesList) { match ->
            Text(
                text = match,
                style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Medium),
                color = colorResource(R.color.white),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}