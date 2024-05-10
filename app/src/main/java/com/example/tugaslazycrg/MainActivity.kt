package com.example.tugaslazycrg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tugaslazycrg.ui.theme.BottomBar
import com.example.tugaslazycrg.ui.theme.TugasLazyCRGTheme
import com.example.tugaslazycrg.ui.theme.Item
import com.example.tugaslazycrg.ui.theme.LazyGridScreen
import com.example.tugaslazycrg.ui.theme.Screen1

class MainActivity : ComponentActivity() {

    companion object {
        val  items :List<Item> = listOf(
            Item(
                title = "One Piece",
                image = R.drawable.image_1
            ),
            Item(
                title = "Bleach",
                image = R.drawable.image2
            ),
            Item(
                title = "Demon Syaler",
                image = R.drawable.image3
            ),
            Item(
                title = "Dragon Ball",
                image = R.drawable.image4
            ),
            Item(
                title = "Naruto",
                image = R.drawable.image5
            ),
            Item(
                title = "Jujutsu Kaisen",
                image = R.drawable.image6
            ),
            Item(
                title = "Wind Breaker",
                image = R.drawable.image7
            ),
            Item(
                title = "Death Note",
                image = R.drawable.image8
            ),
            Item(
                title = "Fairy Tail",
                image = R.drawable.image9
            ),
            Item(
                title = "Black Clover",
                image = R.drawable.image10
            ),
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasLazyCRGTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        //topBar = { MainTopBar(onMenuClick = {}) },
                        bottomBar = { BottomBar() }
                    )
                    { paddingValues ->
                        Column(modifier = Modifier.padding(paddingValues)
                        ) {
                            Screen1()
                        }
                    }
                }
            }
        }
    }
}
