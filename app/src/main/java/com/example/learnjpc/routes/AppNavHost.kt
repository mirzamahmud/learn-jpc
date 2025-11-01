package com.example.learnjpc.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnjpc.features.SignInView
import com.example.learnjpc.features.SplashView

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Routes.Splash) {
        composable(Routes.Splash) {
            SplashView(onNavigate = {navController.navigate(Routes.SignIn){
                popUpTo(Routes.Splash){
                    inclusive = true
                }
            } })
        }
        composable(Routes.SignIn) {
            SignInView(onSignIn = {}, onSignUp = {}, onForgotPassword = {})
        }
    }
}
