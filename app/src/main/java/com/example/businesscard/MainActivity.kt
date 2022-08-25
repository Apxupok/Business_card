package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    InfoCard()
                }
            }
        }
    }
}

@Composable
fun InfoCard(){
    Column(modifier = Modifier
        .background(Color(69, 90, 100))
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.size(300.dp))
        Column(modifier  = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally


        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(100.dp),

            )

            Text(
                text = stringResource(id = R.string.full_name),
                color = Color(255, 251, 255),
                fontSize = 35.sp,
                fontStyle = FontStyle.Italic



            )
            Text(
                text = stringResource(id = R.string.title),
                color = Color(0, 230, 118),
                fontSize = 20.sp

            )
        }
        Spacer(modifier = Modifier.size(200.dp))
        Column(verticalArrangement = Arrangement.Center

        ) {
            Row() {
                Icon(Icons.Rounded.Phone, contentDescription = null,
                    tint = Color(0, 230, 118))
                Text(text = stringResource(id = R.string.number),
                    color = Color(255, 251, 255)
                )

                
            }
            Row() {
                Icon(Icons.Rounded.Share, contentDescription = null,
                    tint = Color(0, 230, 118),

                )
                Text(text = stringResource(id = R.string.link),
                    color = Color(255, 251, 255)

                )

            }
            Row() {
                Icon(Icons.Rounded.Email, contentDescription = null,
                    tint = Color(0, 230, 118))
                Text(text = stringResource(id = R.string.email),
                        color = Color(255, 251, 255)
                )

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        InfoCard()
    }
}