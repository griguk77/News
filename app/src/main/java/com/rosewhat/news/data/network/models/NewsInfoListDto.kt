package com.rosewhat.news.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsInfoListDto(
    @SerializedName("status")
    @Expose
    val status: String,

    @SerializedName("totalResults")
    @Expose
    val totalResults: Int,

    @SerializedName("articles")
    @Expose
    val names: List<NewsInfoDto>,
)