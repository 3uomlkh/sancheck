package com.sancheck.myApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.sancheck.myApp.models.SplashViewModel
import com.sancheck.myApp.ui.theme.SanCheckTheme

class MainActivity : ComponentActivity() {

    private val viewModel: SplashViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition{viewModel.isLoading.value}

        setContent {
            SanCheckTheme {
                Surface {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Main Screen")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SanCheckTheme {
        MainContent()
    }
}