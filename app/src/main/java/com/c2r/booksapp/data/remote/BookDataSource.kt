package com.c2r.booksapp.data.remote

import com.c2r.booksapp.BuildConfig
import com.c2r.booksapp.data.model.CurrentBookList
import com.c2r.booksapp.repository.webservices.WebService

class BookDataSource(private val webService: WebService) {

    suspend fun getResultCurrentBooks() : CurrentBookList = webService.getResultCurrentBooks(BuildConfig.API_KEY)

}