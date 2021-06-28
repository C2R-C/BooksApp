package com.c2r.booksapp.data.model

data class CurrentBook(
    val status : String,
    val copyright : String,
    val num_results : Int,
    val last_modified : String,
    val results : Results
)

data class CurrentBookList(val results: Results)