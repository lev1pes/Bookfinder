package com.example.bookfinder.data

import com.example.bookfinder.data.model.BookInfo
import java.lang.Exception

class Repository {

    private val api = RetrofitInstance.api

    suspend fun getBookInfo(name: String): BookInfo? {
         try {
             return api.getVideosByKeyWords(name)
         } catch (e: Exception) {
             return null
         }
    }

}