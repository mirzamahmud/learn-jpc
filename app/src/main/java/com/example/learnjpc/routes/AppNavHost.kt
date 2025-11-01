package com.example.learnjpc.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnjpc.features.auth.SignInView
import com.example.learnjpc.features.auth.SignUpView
import com.example.learnjpc.features.home.HomeView
import com.example.learnjpc.features.intro.SplashView

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
            SignInView(onSignIn = {
                navController.navigate(Routes.Home){
                    popUpTo(Routes.SignIn){
                        inclusive = true
                    }
                }
            }, onSignUp = {
                navController.navigate(Routes.SignUp){
                    popUpTo(Routes.SignIn){
                        inclusive = false
                    }
                }
            }, onForgotPassword = {})
        }

        composable(Routes.SignUp) {
            SignUpView(onSignUp = {}, onSignIn = {
                navController.navigate(Routes.SignIn){
                    popUpTo(Routes.SignUp){
                        inclusive = true
                    }
                }
            })
        }

        composable(Routes.Home) {
            HomeView()
        }
    }
}
