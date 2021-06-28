package com.c2r.booksapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.c2r.booksapp.core.Resource
import com.c2r.booksapp.repository.BookRepository
import kotlinx.coroutines.Dispatchers

class BookViewModel(private val repo: BookRepository): ViewModel() {

    fun fetchMainScreenBooks() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getResultCurrentBooks()))
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }

}