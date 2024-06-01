package com.sancheck.myApp

sealed class BottomBarScreen(
    val route: String,
    val title: String
) {
    object DiaryList: BottomBarScreen(
        route = "diary",
        title = "일기"
    )
    object Home: BottomBarScreen(
        route = "home",
        title = "홈"
    )
    object Manual: BottomBarScreen(
        route = "manual",
        title = "설명"
    )
}