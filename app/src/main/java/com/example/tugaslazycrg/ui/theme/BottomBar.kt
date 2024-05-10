package com.example.tugaslazycrg.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugaslazycrg.R

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    NavigationBar(modifier) {
        val bottomNavigation = listOf(
            BottomBarItem(
                title = stringResource(id = R.string.txt_Screen1),
                icon = Icons.Default.Home
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_Screen2),
                icon = Icons.Default.Star
            ), BottomBarItem(
                title = stringResource(id = R.string.txt_Profile),
                icon = Icons.Default.AccountCircle
            )
        )
        bottomNavigation.map {
            NavigationBarItem(
                selected = it.title == bottomNavigation[0].title,
                onClick = { },
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(text = it.title) })
        }
    }
}


@Preview
@Composable
fun BottomBarPreview() {
        BottomBar()
}