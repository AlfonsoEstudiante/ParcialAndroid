package com.example.primerparcial_22180.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun gananNegras(navController:NavHostController){
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "Anatholy Karpov vs Gary Kasparov")
        Text(text = "Russia 1993")

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {},
            modifier = Modifier
                .padding(horizontal = 30.dp)
        ) {
            Text(text = "Juegan Blancas")
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {},
            modifier = Modifier
                .padding(horizontal = 30.dp)
        ) {
            Text(text = "Juegan Negras")
        }

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Ganan las Negras")

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            navController.navigate("Jugar")
        },
            modifier = Modifier
                .padding(horizontal = 30.dp)
        ) {
            Text(text = "Reiniciar", modifier = Modifier.fillMaxWidth())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun mensajeGanador2(){
    gananNegras(navController = rememberNavController())
}