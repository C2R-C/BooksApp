package com.c2r.booksapp.repository

import com.c2r.booksapp.data.model.*

interface BookRepository {
    suspend fun getResultCurrentBooks() : CurrentBookList
}