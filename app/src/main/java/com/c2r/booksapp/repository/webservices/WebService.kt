package com.c2r.booksapp.repository.webservices

import com.c2r.booksapp.data.model.*
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("lists/current/hardcover-fiction.json")
    suspend fun getResultCurrentBooks(@Query("api-key") key: String) : CurrentBookList

}