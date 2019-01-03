package com.apps.nb2998.conduit_kotlin.data.models

import com.google.gson.annotations.SerializedName

data class User(@SerializedName("image")
                val image: Null = null,
                @SerializedName("bio")
                val bio: String = "",
                @SerializedName("email")
                val email: String = "",
                @SerializedName("token")
                val token: String = "",
                @SerializedName("username")
                val username: String = "")