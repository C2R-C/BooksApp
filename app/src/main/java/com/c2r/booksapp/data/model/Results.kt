package com.c2r.booksapp.data.model

data class Results(
    val list_name: String = "",
    val list_name_encoded: String = "",
    val bestsellers_date: String = "",
    val published_date: String = "",
    val published_date_description: String = "",
    val next_published_date: String = "",
    val previous_published_date: String = "",
    val display_name: String = "",
    val normal_list_ends_at: Int = -1,
    val updated: String = "",
    val books: MutableList<Book> = mutableListOf(),
    val corrections: List<String>
)