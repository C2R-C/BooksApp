package com.c2r.booksapp.repository

import com.c2r.booksapp.data.model.*
import com.c2r.booksapp.data.remote.BookDataSource

class BookRepositoryImpl(val dataSource: BookDataSource) : BookRepository {

    override suspend fun getResultCurrentBooks(): CurrentBookList = dataSource.getResultCurrentBooks()

}