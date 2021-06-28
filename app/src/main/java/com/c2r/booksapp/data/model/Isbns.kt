package com.c2r.booksapp.data.model

data class Isbns(
    val isbn10: String = "",
    val isbn13: String = ""
)

data class IsbnsList(val isbns: List<Isbns> = listOf())