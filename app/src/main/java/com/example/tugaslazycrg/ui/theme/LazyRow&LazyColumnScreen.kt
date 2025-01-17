package com.example.tugaslazycrg.ui.theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.tugaslazycrg.MainActivity

@Composable
fun Screen1() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(25.dp)) {
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){
            LazyRow(
                contentPadding = PaddingValues(16.dp)
            ) {

                itemsIndexed(MainActivity.items) {
                        index, item ->
                    Spacer(modifier = Modifier.width(8.dp))
                    RowItem(item = item)
                    Spacer(modifier = Modifier.width(8.dp))
                }

            }
            LazyColumn(
                contentPadding = PaddingValues(16.dp)
            ) {

                itemsIndexed(MainActivity.items) {
                        index, item ->
                    ColumnItem(item = item)
                    Spacer(modifier = Modifier.height(8.dp))
                }

            }
        }
    }
}

@Composable
fun RowItem(item: Item){
    Column(
        modifier = Modifier
            .height(350.dp)
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(RoundedCornerShape(30.dp)),
            painter = painterResource(id = item.image),
            contentDescription = item.title,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = item.title,
            fontWeight = FontWeight.SemiBold)
    }
}

@Composable
fun ColumnItem(item: Item){
    Column(
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(30.dp)),
            painter = painterResource(id = item.image),
            contentDescription = item.title,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = item.title,
            fontWeight = FontWeight.SemiBold)
    }
}











