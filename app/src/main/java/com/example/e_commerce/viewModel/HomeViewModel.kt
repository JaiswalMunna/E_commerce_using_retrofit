package com.example.e_commerce.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.paging.cachedIn
import com.example.e_commerce.repo.HomeRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(private  val repository: HomeRepository):ViewModel() {
    fun getProducts()=repository.getProduct().flow.cachedIn(viewModelScope)

}