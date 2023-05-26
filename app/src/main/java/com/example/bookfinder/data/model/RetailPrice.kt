package com.example.bookfinder.data.model


import com.google.gson.annotations.SerializedName

data class RetailPrice(
    @SerializedName("amountInMicros")
    val amountInMicros: Int?,
    @SerializedName("currencyCode")
    val currencyCode: String?
)