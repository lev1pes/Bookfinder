package com.example.bookfinder.domain

import com.example.bookfinder.data.Repository
import com.example.bookfinder.data.model.BookInfo

class GetBookUseCase {

    private val repository = Repository()

    suspend fun execute(name: String): BookInfo? {
        return repository.getBookInfo(name)
    }

}