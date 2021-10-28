package com.rodolfo.ceronekotlin
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CursoDAO {


        @Insert
        suspend fun addCurso(cursoEntity: CursoEntidad)

        @Query("SELECT * from curso_entity")
        suspend fun getAllCursos(): List<CursoEntidad>

        @Query("SELECT * from curso_entity WHERE id=:id")
        suspend fun getCursoById(id: String?): CursoEntidad

        // DAO para manipular la tabla cake_detail_entity
        @Insert
        suspend fun addCursoDetalle(cursoDetalleEntity:CursoDetalleEntidad)

        @Query("SELECT * FROM curso_detalle_entity")
        suspend fun  getCursoDetalle(cursosDetalleEntidad: CursoDetalleEntidad)
}