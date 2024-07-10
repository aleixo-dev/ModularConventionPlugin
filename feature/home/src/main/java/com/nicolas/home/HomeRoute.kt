package com.nicolas.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeRoute(modifier: Modifier = Modifier, onNavigateDetails: () -> Unit) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello!")
        Button(onClick = { onNavigateDetails.invoke() }) {
            Text(text = "Click me")
        }
    }
}