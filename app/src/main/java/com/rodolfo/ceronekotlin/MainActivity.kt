package com.rodolfo.ceronekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun getRetrofit(): Retrofit? {

        return Retrofit.Builder().baseUrl("https://courses-fake-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create()).build()


    }
}

