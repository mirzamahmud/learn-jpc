package com.example.learnjpc.features

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SignInView(onSignIn: () -> Unit, onSignUp: () -> Unit, onForgotPassword: () -> Unit){
    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp, 56.dp, 16.dp, 20.dp),
        contentAlignment = Alignment.TopStart
    ){
        Column {
            Icon(Icons.Outlined.Place, tint = Color.Blue, contentDescription = "App Logo", modifier = Modifier.size(width = 64.dp, height = 64.dp))
            Spacer(modifier = Modifier.height(12.dp))
            Text("Welcome Back", style = MaterialTheme.typography.titleLarge.copy(color = Color.Blue))
        }
    }
}