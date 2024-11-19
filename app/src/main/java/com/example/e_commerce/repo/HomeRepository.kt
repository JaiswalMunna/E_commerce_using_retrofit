package com.example.e_commerce.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.e_commerce.network.ApiInterface
import com.example.e_commerce.paging_Source.ProductPagingSource
import com.example.e_commerce.response.Product
import javax.inject.Inject

class HomeRepository @Inject constructor(private val apiInterface:ApiInterface) {

     fun getProduct():Pager<Int,Product> = Pager(
        config = PagingConfig(
            pageSize = 10, enablePlaceholders = false
        ),
        pagingSourceFactory = {
            ProductPagingSource(apiInterface)
        }
    )
}