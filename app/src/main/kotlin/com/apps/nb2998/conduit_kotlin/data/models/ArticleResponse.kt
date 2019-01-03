package com.apps.nb2998.conduit_kotlin.data.models

import com.google.gson.annotations.SerializedName

data class ArticleResponse(@SerializedName("article")
                           var article: Article)