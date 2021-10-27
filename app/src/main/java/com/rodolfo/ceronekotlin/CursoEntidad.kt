package com.rodolfo.ceronekotlin

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "curso_entity")
class CursoEntidad(
    @SerializedName("id") val id: Any,
    @SerializedName("title") val title: String,
    @SerializedName("previewDescription") val previewDescription: String,
    @SerializedName("image") val image: String,
    @SerializedName("weeks") val weeks: Int,
    @SerializedName("start") val start: String
)


