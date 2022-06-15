package com.aldikitta.jetui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(val route: String, val label: String, val icons: ImageVector) {

    object Home : NavigationItem("home", "Home", Icons.Filled.Home)
    object Notifications :
        NavigationItem("notifications", "Notifications", Icons.Filled.Notifications)

    object Settings : NavigationItem("setting","Settings",Icons.Filled.Settings)

    object Account: NavigationItem("account","Account",Icons.Filled.AccountCircle)

}