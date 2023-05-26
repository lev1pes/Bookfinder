package com.example.bookfinder.data.model


import com.google.gson.annotations.SerializedName

data class BookInfo(
    @SerializedName("items")
    val items: List<Item>?,
    @SerializedName("kind")
    val kind: String?,
    @SerializedName("totalItems")
    val totalItems: Int?
)