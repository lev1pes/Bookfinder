package com.example.bookfinder.data

import com.example.bookfinder.data.model.BookInfo
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface BookApi {

    @Headers("Content-Type: application/json")
    @GET("volumes/")
    suspend fun getVideosByKeyWords(
        @Query("q") bookName: String
    ): BookInfo

}