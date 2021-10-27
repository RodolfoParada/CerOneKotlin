package com.rodolfo.ceronekotlin

import com.google.gson.annotations.SerializedName

data class Cursos(
    @SerializedName("id") val id:Any,
    @SerializedName("title")val title:String,
    @SerializedName("previewDescription") val previewDescription:String,
    @SerializedName("image") val image:String,
    @SerializedName("weeks") val weeks:Int,
    @SerializedName("start") val start:String
)