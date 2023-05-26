package com.example.bookfinder.data.model


import com.google.gson.annotations.SerializedName

data class Epub(
    @SerializedName("acsTokenLink")
    val acsTokenLink: String?,
    @SerializedName("isAvailable")
    val isAvailable: Boolean?
)