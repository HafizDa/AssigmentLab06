package com.example.assigmentlab06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.assigmentlab06.ui.theme.AssigmentLab06Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AssigmentLab06Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MPInfoScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}