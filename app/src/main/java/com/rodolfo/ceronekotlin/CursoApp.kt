package com.rodolfo.ceronekotlin

import android.app.Application
import androidx.room.Room

class CursoApp : Application() {

    val room = Room
        .databaseBuilder(this, BaseDeDatos::class.java, "basededatoApp")
        .build()
}