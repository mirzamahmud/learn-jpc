package com.example.learnjpc.features

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.time.delay
import kotlin.time.Duration.Companion.seconds

@Composable
fun SplashView(onNavigate: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(4.seconds)
        onNavigate()
    }


    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                Icons.Outlined.Place,
                contentDescription = "App Logo",
                modifier = Modifier.align(Alignment.CenterHorizontally).size(height = 108.dp, width = 108.dp),
                tint = Color.Blue
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Learn Jetpack Compose",
                style = TextStyle(fontSize = 18.sp, color = Color.Blue, fontWeight = FontWeight.W600)
            )
        }
    }
}