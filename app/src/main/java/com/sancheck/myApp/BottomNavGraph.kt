package com.sancheck.myApp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sancheck.myApp.screens.DiaryListScreen
import com.sancheck.myApp.screens.HomeScreen
import com.sancheck.myApp.screens.ManualScreen

@Composable
fun BottomNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
        modifier = modifier
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.DiaryList.route) {
            DiaryListScreen()
        }
        composable(route = BottomBarScreen.Manual.route) {
            ManualScreen()
        }
    }
}