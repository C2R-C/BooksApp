package com.c2r.booksapp.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.c2r.booksapp.R
import com.c2r.booksapp.core.Resource
import com.c2r.booksapp.data.remote.BookDataSource
import com.c2r.booksapp.databinding.FragmentBookBinding
import com.c2r.booksapp.presentation.BookViewModel
import com.c2r.booksapp.presentation.BookViewModelFactory
import com.c2r.booksapp.repository.BookRepositoryImpl
import com.c2r.booksapp.repository.webservices.RetrofitClient


class BookFragment : Fragment(R.layout.fragment_book) {

    private lateinit var binding: FragmentBookBinding
    private val viewModel by viewModels<BookViewModel> {
        BookViewModelFactory(
            BookRepositoryImpl(
                BookDataSource(
                    RetrofitClient.webservice
                )
            )
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBookBinding.bind(view)

        viewModel.fetchMainScreenBooks().observe(viewLifecycleOwner, {
            when(it) {
                is Resource.Loading -> {
                    Log.d("LIVEDATA", "LOADING")
                }
                is Resource.Success -> {
                    Log.d("LIVEDATA", "${it.data}")
                }
                is Resource.Failure -> {
                    Log.d("ERROR", "${it.exception}")
                }
            }
        })
    }

}