package com.rodolfo.ceronekotlin

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "curso_detalle_entity")
class CursoDetalleEntidad (
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