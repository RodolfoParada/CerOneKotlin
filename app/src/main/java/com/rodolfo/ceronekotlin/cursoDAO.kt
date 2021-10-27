package com.rodolfo.ceronekotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
class interface  CursoDAO(

    @Insert
    fun addCurso(cursoEntity: CursoEntidad?)

    @Query("SELECT * from curso_entity")
    fun getAllCursos(): List<CursoEntidad?>?

    @Query("SELECT * from curso_entity WHERE id=:id")
    fun getCursoById(id: String?): CursoEntidad?

    // DAO para manipular la tabla cake_detail_entity
    @Insert
    fun addCursoDetalle(cursoDetalleEntity: CursoDetalleEntidad?)

    @Query("SELECT * from curso_detalle_entity WHERE id=:id")
    fun getCursoDetalleById(id: Double): CursoDetalleEntidad?
)
