package com.github.ivan_osipov.clabo.model

import com.google.gson.annotations.SerializedName

class ChatMember {

    @SerializedName("user")
    lateinit var user: User

    @SerializedName("status")
    lateinit var status: String

}