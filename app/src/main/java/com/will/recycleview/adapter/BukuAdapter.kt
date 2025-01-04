package com.will.recycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.will.recycleview.R
import com.will.recycleview.model.ModelBuku

class BukuAdapter(private val buku: List<ModelBuku>) :
RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>(){
    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtJudul: TextView = view.findViewById(R.id.txtJudul)
        val txtPenulis: TextView = view.findViewById(R.id.txtPenulis)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BukuAdapter.BukuAdapterHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_view, parent, false)
        return BukuAdapterHolder(view)
    }

    override fun onBindViewHolder(holder: BukuAdapter.BukuAdapterHolder, position: Int) {
        holder.txtJudul.text = buku[position].judul
        holder.txtPenulis.text = buku[position].penulis
    }

    override fun getItemCount(): Int {
        return buku.size
    }
}