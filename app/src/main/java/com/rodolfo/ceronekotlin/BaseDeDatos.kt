package com.rodolfo.ceronekotlin

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [CursoEntidad::class,CursoDetalleEntidad::class],
    version =1)
abstract class  BaseDeDatos : RoomDatabase() {
    abstract fun  cursoDAO(): CursoDAO
}