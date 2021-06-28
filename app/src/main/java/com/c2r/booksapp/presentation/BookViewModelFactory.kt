package com.c2r.booksapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.c2r.booksapp.repository.BookRepository

class BookViewModelFactory(private val repo: BookRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(BookRepository::class.java).newInstance(repo)
    }
}