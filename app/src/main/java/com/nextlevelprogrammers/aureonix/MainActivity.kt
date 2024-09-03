package com.nextlevelprogrammers.aureonix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nextlevelprogrammers.aureonix.ui.theme.AureonixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AureonixTheme {
                AureonixApp()
            }
        }
    }
}

@Composable
fun AureonixApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { AureonixTopBar() }
    ) { innerPadding ->
        // Content of the page goes here
        Box(modifier = Modifier.padding(innerPadding)) {
            Text(text = "Hello, Aureonix!")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AureonixTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "AUREONIX",
                fontWeight = FontWeight.Bold, // Set text to bold for the logo
                color = MaterialTheme.colorScheme.primary // Use theme's primary color or adjust as needed
            )
        },
        actions = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(32.dp)
                    .clickable {
                        // Handle menu click here
                    }
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent, // Set the background color of the TopAppBar
            titleContentColor = Color.Black, // Set the color for the title text
            actionIconContentColor = Color.White // Set the color for action icons
        ),
        scrollBehavior = null, // Optional, adjust if using scroll behavior
    )
}

@Preview(showBackground = true)
@Composable
fun AureonixAppPreview() {
    AureonixTheme {
        AureonixApp()
    }
}
