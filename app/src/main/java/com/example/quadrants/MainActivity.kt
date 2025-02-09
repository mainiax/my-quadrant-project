package com.example.quadrants

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrants.ui.theme.QuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                    Greeting(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxHeight()) {
        Row(modifier = Modifier.weight(1f)) {
            ComposeQuadrant(
                color = R.color.colorQuadrant1,
                head = "Text composable",
                body = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1f)

            )
            ComposeQuadrant(
                color = R.color.colorQuadrant2,
                head = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)

            )
        }
        Row(modifier = Modifier.weight(1f)) {
            ComposeQuadrant(
                color = R.color.colorQuadrant3,
                head = "Row composable",
                body = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)

            )
            ComposeQuadrant(
                color = R.color.colorQuadrant4,
                head = "Column composable",
                body = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)

            )
        }
    }

}

@Composable
fun ComposeQuadrant(color: Int, head:String, body:String, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.background(colorResource(id = color)).fillMaxHeight()) {

        Text(
            text = head,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp),
            textAlign = TextAlign.Center,

        )
        Text(
            text = body,
            modifier = Modifier,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp
        )
    }


}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuadrantsTheme {
    Greeting(
        modifier = Modifier.padding()
    )
    }
}