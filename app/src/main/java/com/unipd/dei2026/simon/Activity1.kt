package com.unipd.dei2026.simon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ButtonDefaults.shape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType


@Composable
fun Activity1(modifier:Modifier= Modifier, onButtonClicked: ()-> Unit){
    var t by remember {mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        horizontalAlignment =Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment =Alignment.CenterHorizontally
        ){
            Spacer(modifier=Modifier.height(50.dp))
            Row{
                Button(
                    onClick = {
                        val comma =if (t.isEmpty()) "" else ", "
                        t +=comma+'R'},
                    colors = buttonColors(colorResource(R.color.red)),
                    modifier= Modifier.padding(2.dp).fillMaxWidth().height(120.dp).weight(1f),
                    shape= RoundedCornerShape(15.dp)
                ) {}

                Button(
                    onClick = {
                        val comma =if (t.isEmpty()) "" else ", "
                        t +=comma+'M'},
                    colors = buttonColors(colorResource(R.color.magenta)),
                    modifier = Modifier.padding(2.dp).fillMaxWidth().height(120.dp).weight(1f),
                    shape= RoundedCornerShape(15.dp)
                ) {}
            }

            Row {
                Button(
                    onClick = {
                        val comma = if (t.isEmpty()) "" else ", "
                        t += comma + 'Y'
                    },
                    colors = buttonColors(colorResource(R.color.yellow)),
                    modifier = Modifier.padding(2.dp).fillMaxWidth().height(120.dp).weight(1f),
                    shape= RoundedCornerShape(15.dp)
                ) {}
                Button(
                    onClick = {
                        val comma = if (t.isEmpty()) "" else ", "
                        t += comma + 'G'
                    },
                    colors = buttonColors(colorResource(R.color.green)),
                    modifier = Modifier.padding(2.dp).fillMaxWidth().height(120.dp).weight(1f),
                    shape= RoundedCornerShape(15.dp)
                ) {}
            }

            Row {
                Button(
                    onClick = {
                        val comma =if (t.isEmpty()) "" else ", "
                        t +=comma+'C'},
                    colors = buttonColors(colorResource(R.color.cyan)),
                    modifier = Modifier.padding(2.dp).fillMaxWidth().height(120.dp).weight(1f),
                    shape= RoundedCornerShape(15.dp)
                ) {}
                Button(
                    onClick = {
                        val comma =if (t.isEmpty()) "" else ", "
                        t +=comma+'B'},
                    colors = buttonColors(colorResource(R.color.blue)),
                    modifier = Modifier.padding(2.dp).fillMaxWidth().height(120.dp).weight(1f),
                    shape= RoundedCornerShape(15.dp)
                ) {}
            }
            Spacer(modifier=Modifier.height(100.dp))

            TextField(
                value=t,
                onValueChange={t=it},
                readOnly=true,
                textStyle=TextStyle(fontSize=20.sp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                singleLine = true
            )

            Spacer(modifier=Modifier.height(20.dp))
            Row {
                Button(
                    onClick={
                        val cancel=if (t.isNotEmpty()==true) "" else ""
                        t=cancel },
                    shape= RectangleShape
                ){
                    Text(text=stringResource(R.string.delete))
                }
                Spacer(modifier=Modifier.width(20.dp))
                Button(
                    onClick = onButtonClicked,
                    shape= RectangleShape
                    ) {
                    Text(text = stringResource(R.string.endOf_game))
                }
            }


    }

    }
}


