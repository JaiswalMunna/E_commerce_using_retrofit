package com.example.e_commerce.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.e_commerce.viewModel.HomeViewModel

@Preview(showBackground = true)
@Composable
fun HomeScreenUI(modifier: Modifier=Modifier, viewModel:HomeViewModel=hiltViewModel()){
    val products=viewModel.getProducts().collectAsLazyPagingItems()
    Column(modifier=modifier.fillMaxSize().background(color = Color.LightGray)) {

    }

}