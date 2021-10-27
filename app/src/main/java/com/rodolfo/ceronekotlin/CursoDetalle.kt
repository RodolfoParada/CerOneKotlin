package com.rodolfo.ceronekotlin

import com.google.gson.annotations.SerializedName

data class CursoDetalle(
    @SerializedName("id") val id:Any,
    @SerializedName("title") val title:String,
    @SerializedName("description") val description:String,
    @SerializedName("image") val image:String,
    @SerializedName("weeks") val weeks:Int,
    @SerializedName("tuition") val tuition:String,
    @SerializedName("minimumSkill") val minimumSkill:String,
    @SerializedName("scholarshipsAvailable") val scholarshipsAvailable:Boolean,
    @SerializedName("modality") val modality:String,
    @SerializedName("start") val start:String
)