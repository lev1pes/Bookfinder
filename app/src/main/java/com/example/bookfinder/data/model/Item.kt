package com.example.bookfinder.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Item(
    @SerializedName("accessInfo")
    val accessInfo: AccessInfo?,
    @SerializedName("etag")
    val etag: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("kind")
    val kind: String?,
    @SerializedName("saleInfo")
    val saleInfo: SaleInfo?,
    @SerializedName("searchInfo")
    val searchInfo: SearchInfo?,
    @SerializedName("selfLink")
    val selfLink: String?,
    @SerializedName("volumeInfo")
    val volumeInfo: VolumeInfo?
): Serializable