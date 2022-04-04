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
import androidx.constraintlayout.compose.ConstraintLayout


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
    Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 100.dp)

    ) {
        Text(text = "Rock, Scissors, Paper!", fontSize = 32.sp)

        Text(text = "Chose to Play!", fontSize = 44.sp, modifier = Modifier
            .padding(vertical = 12.dp))

        OutlinedTextField(value = "Human", onValueChange = {}, modifier = Modifier
            .padding(top = 45.dp))

        OutlinedTextField(value = "Computer", onValueChange = {}, modifier = Modifier
            .padding(top = 8.dp))

        Row(modifier = Modifier.padding(vertical = 25.dp)) {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Rock")
            }
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Scissors")
            }
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Paper ")
            }

        }
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Play")
        }



    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()

}