package com.example.presidenreva

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.presidenreva.model.data
import com.example.presidenreva.model.presiden

class urut_presiden(private val context: Context, private val presiden : ArrayList <presiden>,
                    private val listener: (presiden) -> Unit): RecyclerView.Adapter<urut_presiden.viewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): urut_presiden.viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return data.urut_presiden.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bindpresiden(presiden[position], listener)

    }

    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindpresiden(presiden: presiden, listener: (presiden) -> Unit) {
            tvName.text = presiden.name
            tvDetail.text = presiden.detail
            Glide.with(itemView.context)
                .load(presiden.poster)
                .into(imgPoster)
        }
    }
}