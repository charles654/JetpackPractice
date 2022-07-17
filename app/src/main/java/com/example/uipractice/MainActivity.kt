package com.example.uipractice

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uipractice.ui.theme.UiPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainLayout()
        }
    }
}

@Composable
fun MainLayout() {
    val primaryColor = Color(26, 32, 53, 255);
    val textOutlineColors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = primaryColor,
        textColor = Color.Black,
        focusedLabelColor = primaryColor,
        cursorColor = Color.Black,
    )
    val textStyle = TextFieldDefaults.textFieldColors(
        textColor = Color.Blue
    )
    val pacificoRegular = FontFamily(
        Font(R.font.pacifico_regular)
    )
    val abrilfatRegular = FontFamily(
        Font(R.font.abrilfatface_regular)
    )
   UiPracticeTheme() {
       Surface(
           color = MaterialTheme.colors.background,
       ) {
           Column (
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.SpaceBetween,
               modifier = Modifier
                   .fillMaxSize()
                   .background(color = Color(26, 32, 53, 255))
                   ) {
               Row(horizontalArrangement = Arrangement.End,
                   verticalAlignment = Alignment.CenterVertically,
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(top = 100.dp)
                   ) {
                   Image(
                       painterResource(R.mipmap.img),
                       contentDescription = "",
                       contentScale = ContentScale.FillWidth,
                       alignment = Alignment.TopEnd,
                   )
               }
               Column( horizontalAlignment = Alignment.Start,
               verticalArrangement = Arrangement.Top,
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(bottom = 100.dp, start = 10.dp)
                   ) {
                   Box(modifier = Modifier
                       .height(3.dp)
                       .background(color = Color.White)
                       .width(100.dp)
                   )
                   Spacer(modifier = Modifier.height(25.dp))
                   Box(modifier = Modifier
                       .height(3.dp)
                       .background(color = Color.White)
                       .width(250.dp)
                   )
               }
               Column( horizontalAlignment = Alignment.Start,
                   verticalArrangement = Arrangement.Top,
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(bottom = 100.dp, start = 10.dp)
               ) {
                   Text(text = "Searching for a job?",
                       style = TextStyle(color = Color.White),
                       fontSize = 35.sp,
                       fontFamily = abrilfatRegular,
                       fontWeight = FontWeight.Normal
                       )
                   Text(text = "Undoubtedly your’e in the right place.",
                       style = TextStyle(color = Color(255,255,255,95)),
                       fontSize = 20.sp,
                       fontFamily = pacificoRegular,
                       fontWeight = FontWeight.Normal
                       )
               }
               Row( horizontalArrangement = Arrangement.SpaceBetween,
                   verticalAlignment = Alignment.CenterVertically,
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(bottom = 30.dp, start = 20.dp,end = 20.dp)
               ) {
                   Button(onClick = { /*TODO*/ },
                       colors = ButtonDefaults.buttonColors(
                           backgroundColor = Color.White,
                           disabledBackgroundColor = Color.Gray,
                           contentColor = primaryColor,
                           disabledContentColor = Color.White
                       )
                   ) {
                       Text(text = "LOGIN")
                   }
                   Button(onClick = { /*TODO*/ },
                       colors = ButtonDefaults.buttonColors(
                           backgroundColor = primaryColor,
                           disabledBackgroundColor = Color.Gray,
                           contentColor = Color.White,
                           disabledContentColor = Color.White
                       ),
                       modifier = Modifier.border(width = 1.dp,color = Color.White, shape = RoundedCornerShape(4.dp))
                       ) {
                       Text(text = "JOIN NOW")
                   }
               }
               
           }

               
           }
       }
   }


@Composable
fun ToolBar() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth()
            .background(color = Color.White)
        ) {
        Text(text = "Home")

    }
}
@Composable
fun TextView(text: String) {
        Box(modifier = Modifier
            .padding(10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(5.dp))
            .fillMaxWidth()
            .padding(15.dp)
        )
            {
                var textvalue by remember { mutableStateOf("")}
                TextField(value = textvalue, onValueChange = {textvalue = it},
                       colors = TextFieldDefaults.textFieldColors(
                           textColor = Color.Black,
                           disabledTextColor = Color.Transparent,
                           backgroundColor = Color.Transparent,
                           focusedIndicatorColor = Color.Transparent,
                           unfocusedIndicatorColor = Color.Transparent,
                           disabledIndicatorColor = Color.Transparent
                       ),
                    label = { Text(text = "User name")}
                   )
        }
}

@Composable
fun LoginButton(text: String){
    Button(onClick = { buttonClick() },
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(color = Color.Black)
            .border(width = 1.dp, color = Color.Transparent, shape = RoundedCornerShape(10.dp))
        ,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(19, 55, 182, 255),
            disabledBackgroundColor = Color.Gray,
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = text)
    }
}

fun buttonClick(){
    
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MainLayout()
}