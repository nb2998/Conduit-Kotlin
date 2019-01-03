package com.apps.nb2998.conduit_kotlin.data.models

import com.google.gson.annotations.SerializedName

data class Author(@SerializedName("image")
                  val image: String = "",
                  @SerializedName("following")
                  val following: Boolean = false,
                  @SerializedName("bio")
                  val bio: String = "",
                  @SerializedName("username")
                  val username: String = "")