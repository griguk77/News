package com.rosewhat.news.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsInfoIdDto(
    @SerializedName("id")
    @Expose
    val id: Any,

    @SerializedName("name")
    @Expose
    val name: String,
)