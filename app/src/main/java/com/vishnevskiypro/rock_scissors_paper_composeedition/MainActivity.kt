package com.vishnevskiypro.rock_scissors_paper_composeedition

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting (){
    val options = arrayOf("Rock", "Scissors", "Paper")

    val humanValue = remember {
        mutableStateOf("Human")
    }
    val computerValue = remember {
        mutableStateOf("Computer")
    }
    val gameResult = remember {
        mutableStateOf("Chose to Play")
    }


    Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 100.dp)

    ) {
        Text(text = "Rock, Scissors, Paper!", fontSize = 32.sp)

        Text(text = gameResult.value, fontSize = 30.sp, modifier = Modifier
            .padding(vertical = 12.dp))

        OutlinedTextField(value = humanValue.value, onValueChange = {}, modifier = Modifier
            .padding(top = 45.dp))

        OutlinedTextField(value = computerValue.value, onValueChange = {}, modifier = Modifier
            .padding(top = 8.dp))

        Row(modifier = Modifier.padding(vertical = 25.dp)) {
            OutlinedButton(onClick = {humanValue.value = "Rock"}) {
                Text(text = "Rock")
            }
            OutlinedButton(onClick = {humanValue.value = "Scissors"}) {
                Text(text = "Scissors")
            }
            OutlinedButton(onClick = {humanValue.value = "Paper"}) {
                Text(text = "Paper ")
            }

        }
        
        Button(onClick = {
            computerValue.value = options[(Math.random()*options.size).toInt()]

            val humanParam: String = humanValue.value
            val computerParam: String = computerValue.value
            gameResult.value = whoWin(humanParam, computerParam)


        }, modifier = Modifier.padding(top = 20.dp)) {
            Text(text = "Play")
        }



    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()

}