package br.com.fiap.easycit.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.easycit.screens.HomeScreen
import br.com.fiap.easycit.screens.LoginScreen
import br.com.fiap.easycit.screens.SignUpScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {



    NavHost(
        navController = navController,
        startDestination = "Login",
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.End
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.End
            ) + fadeOut()
        }

    ) {
        composable(route = "Login") {
            LoginScreen(navController)
        }
        composable(route = "Home") {
            HomeScreen(navController)
        }
        composable(route = "SignUp") {
            SignUpScreen(navController)
        }
    }
}