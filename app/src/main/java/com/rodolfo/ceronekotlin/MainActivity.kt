package com.rodolfo.ceronekotlin

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class MainActivity : AppCompatActivity() {

    lateinit var cursoLista:List<Cursos>
    lateinit var cursoDetalleLista: List<CursoDetalle>
    lateinit var rvCursos:RecyclerView
    lateinit var CursoAdapter:CursoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cursoLista = ArrayList<Cursos>()
        cursoDetalleLista = ArrayList<CursoDetalle>()
        rvCursos = findViewById(R.id.rvCursos) as RecyclerView
        rvCursos.layoutManager = LinearLayoutManager(applicationContext)

        cargarCursos()
    }

    fun cargarCursos() { CargarCursos().execute()

    }

    private class CargarCursos: AsyncTask<String,Void,String>(){
        override fun doInBackground(vararg params: String): String? {
            lateinit var cursoLista:ArrayList<Cursos>
            try {
                getRetrofit().create(CursoAPI::class.java).getCursos("courses").execute().body()
                    .also { cursoLista =

            }catch (e:IOException){
                e.printStackTrace()
            }
            return null
        }










        fun getRetrofit(): Retrofit {

            return Retrofit.Builder().baseUrl("https://courses-fake-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create()).build()


        }
    }



}

