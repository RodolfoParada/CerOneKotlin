package com.rodolfo.ceronekotlin

import androidx.room.Room

class CursoApp extends Application (
    val basededatoApp: BaseDeDatos? = null

    @Override
    public void onCreate() (
        super.onCreate()
        CursoApp.basededatoApp =
            Room.databaseBuilder(this, BaseDeDatos::class.java, "app-db").build()
        )
        )
