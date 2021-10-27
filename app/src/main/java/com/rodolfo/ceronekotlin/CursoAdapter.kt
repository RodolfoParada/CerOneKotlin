package com.rodolfo.ceronekotlin

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CursoAdapter:RecyclerView.Adapter<CursoAdapter.ViewHolder> {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var ivCurso:ImageView
        lateinit var tvTitle:TextView
        lateinit var tvSemana:TextView


        fun ViewHolder(itemview:View){
            ivCurso=itemview.findViewById(R.id.ivCurso) as ImageView


        }
    }
}
