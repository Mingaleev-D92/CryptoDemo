package com.example.cryptodemo.model.detailResponse


import com.google.gson.annotations.SerializedName

data class DetailResponse(
    @SerializedName("data")
    val `data`: Any?,
    @SerializedName("status")
    val status: Status?
)