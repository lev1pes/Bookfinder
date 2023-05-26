package com.example.bookfinder.data.model


import com.google.gson.annotations.SerializedName

data class Offer(
    @SerializedName("finskyOfferType")
    val finskyOfferType: Int?,
    @SerializedName("listPrice")
    val listPrice: ListPriceX?,
    @SerializedName("retailPrice")
    val retailPrice: RetailPrice?
)