package com.example.responsi_254.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.responsi_254.DetailActivity
import com.example.responsi_254.R
import com.example.responsi_254.model.Makanan

class ListMakananAdapter(private val listMakanan: ArrayList<Makanan>)
    : RecyclerView.Adapter<ListMakananAdapter.MakananViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.daftar_makanan, parent, false)
        return MakananViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val makanan = listMakanan[position]
        holder.tvName.text = makanan.name
        holder.tvDetail.text = makanan.detail
        Glide.with(holder.itemView.context)
            .load(makanan.poster)
            .into(holder.imgPoster)

        /*holder.itemView.setOnClickListener {
            val pindahDetailActivity = Intent(holder.mContext, DetailActivity::class.java)
            DetailActivity.putExtra(DetailActivity.EXTRA_NAME, makanan.name)
            DetailActivity.putExtra(DetailActivity.EXTRA_DETAIL, makanan.detail)
            DetailActivity.putExtra(DetailActivity.EXTRA_POSTER, makanan.poster)
            holder.mContext.startActivity(pindahDetailActivity)

        } */

    }

    inner class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)

        val mContext: Context = itemView.context
    }
}