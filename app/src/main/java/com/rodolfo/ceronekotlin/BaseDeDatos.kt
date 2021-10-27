package com.rodolfo.ceronekotlin

import androidx.room.Database

//Room.databaseBuilder(CursoEntidad.class, CursoDetalleEntidad::class)


    @Database(entities = {CursoEntidad.class,CursoDetalleEntidad.class.java},version =1)
    abstract class  BaseDeDatos extends RoomDatabase {
         abstract class CursoDAO cursoDAO()
}