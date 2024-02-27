package com.example.primerparcial_22180

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.primerparcial_22180.view.gananBlancas
import com.example.primerparcial_22180.view.gananNegras
import com.example.primerparcial_22180.view.jugar

@Composable
fun funcionalidad(){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "Jugar"){
        composable(route = "Jugar"){
            jugar(navController)
        }

        composable(route = "GananBlancas"){
            gananBlancas(navController)
        }

        composable(route = "GananNegras"){
            gananNegras(navController)
        }
    }
}