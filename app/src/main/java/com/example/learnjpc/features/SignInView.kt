package com.example.learnjpc.features

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnjpc.components.HorizontalGap
import com.example.learnjpc.components.VerticalGap

@Composable
fun SignInView(onSignIn: () -> Unit, onSignUp: () -> Unit, onForgotPassword: () -> Unit){
    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp, 56.dp, 16.dp, 20.dp),
        contentAlignment = Alignment.TopStart
    ){
        Column (
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Icon(Icons.Outlined.Place, tint = Color.Blue, contentDescription = "App Logo", modifier = Modifier.size(width = 64.dp, height = 64.dp))
            VerticalGap(12)

            Text("Welcome Back", style = MaterialTheme.typography.titleLarge.copy(color = Color.Blue, fontWeight = FontWeight.W600))
            VerticalGap(4)
            
            Text("Sign in to continue your journey.", style = MaterialTheme.typography.titleSmall.copy(
                color = Color.Gray,
                fontWeight = FontWeight.W400
            ))
            VerticalGap(36)

            // Sign In Form
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = {},
                label = { Text("Email") },
                placeholder = { Text("Enter your email") }
            )
            VerticalGap(12)

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                onValueChange = {},
                label = { Text("Password") },
                placeholder = { Text("Enter your password") },
                suffix = {Icon(Icons.Outlined.Lock, contentDescription = "Password")}
            )
            VerticalGap(16)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(checked = false, onCheckedChange = {}, modifier = Modifier.size(24.dp))
                    HorizontalGap(8)
                    Text("Remember me", style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black))
                }
                Text("Forgot Password?", style = MaterialTheme.typography.bodyMedium.copy(color = Color.Red), modifier = Modifier.clickable(onClick = onForgotPassword))
            }
            VerticalGap(24)

            Button(
                onClick = onSignIn,
            ) {
                Text("Sign In", style = MaterialTheme.typography.labelLarge.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600
                ), textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(6.dp))
            }
            VerticalGap(12)

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Don't have an account?", style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black, fontWeight = FontWeight.W400))
                    HorizontalGap(8)
                    Text("Sign Up", style = MaterialTheme.typography.bodyMedium.copy(color = Color.Blue, fontWeight = FontWeight.W600), modifier = Modifier.clickable(onClick = onSignUp))
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun SignInViewPreview() {
    SignInView(onSignIn = {}, onSignUp = {}, onForgotPassword = {})
}