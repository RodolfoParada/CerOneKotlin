package com.rodolfo.ceronekotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class CursoAdapter:RecyclerView.Adapter<CursoAdapter.ViewHolder> {

    lateinit var cursoLista: List<CursoEntidad>
    lateinit var context: Context

    constructor(cursoLista: List<CursoEntidad>, context: Context) : super() {
        this.cursoLista = cursoLista
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.cursos_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        try {
            Picasso.get().load(cursoLista.get(position).image).into(holder.ivCurso)
            holder.tvTitle.setText(cursoLista.get(position).title)
            holder.tvSemana.setText(cursoLista.get(position).weeks)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getItemCount(): Int {
        return cursoLista.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var ivCurso: ImageView
        lateinit var tvTitle: TextView
        lateinit var tvSemana: TextView


        fun ViewHolder(itemview: View) {
            ivCurso = itemview.findViewById(R.id.ivCurso)
            tvTitle = itemview.findViewById(R.id.tvTitle)
            tvSemana = itemview.findViewById(R.id.tvSemana)


        }
    }
}
