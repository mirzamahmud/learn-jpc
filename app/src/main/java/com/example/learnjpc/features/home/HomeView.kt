package com.example.learnjpc.features.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learnjpc.components.VerticalGap
import com.example.learnjpc.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth().height(96.dp),
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                title = {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier.size(56.dp).clip(
                                CircleShape).background(color = Color.White.copy(alpha = 0.2f))
                        ) {
                            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), modifier = Modifier.size(56.dp).clip(
                                CircleShape
                            ), contentDescription = null)
                        }
                        Column(
                            modifier = Modifier.padding(start = 8.dp),
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Mirza Mahmud", style = MaterialTheme.typography.labelLarge.copy(
                                fontWeight = FontWeight.W600, fontSize = 16.sp
                            ))
                            VerticalGap(2)
                            Text("Dhaka, Bangladesh", style = MaterialTheme.typography.bodyMedium.copy(
                                color = Color.White.copy(alpha = 0.4f), fontWeight = FontWeight.W400, fontSize = 12.sp
                            ))
                        }
                    }
                },
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(Icons.Filled.Notifications, contentDescription = null, modifier = Modifier.size(20.dp))
                    }
                }
            )
        }
    ) { innerPadding -> Column(
        modifier = Modifier.padding(innerPadding).padding(16.dp, 20.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {

    }}
}