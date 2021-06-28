package com.c2r.booksapp.data.model

data class Buy_links(
    val name: String = "",
    val url: String = ""
)

data class Buy_linksList(val buy_links: List<Buy_links> = mutableListOf())