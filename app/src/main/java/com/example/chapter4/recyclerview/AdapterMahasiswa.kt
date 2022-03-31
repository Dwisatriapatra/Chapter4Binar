package com.example.chapter4.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4.R
import kotlinx.android.synthetic.main.item_mahasiswa_adapter.view.*

class AdapterMahasiswa(val dataList : ArrayList<DataMahasiswa>):RecyclerView.Adapter<AdapterMahasiswa.ViewHolder>() {
    class ViewHolder(layout: View) : RecyclerView.ViewHolder(layout){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMahasiswa.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_mahasiswa_adapter, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AdapterMahasiswa.ViewHolder, position: Int) {
        holder.itemView.tv_nama.text = dataList[position].nama
        holder.itemView.tv_umur.text = dataList[position].umur
        holder.itemView.imageFoto.setImageResource(dataList[position].imgMahasiswa)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}