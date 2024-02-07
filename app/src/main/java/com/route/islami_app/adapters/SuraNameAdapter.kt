package com.route.islami_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.islami_app.R
import com.route.islami_app.model.Sura


class SuraNameAdapter(val suranames :ArrayList<Sura>): Adapter<SuraNameAdapter.SuraNameViewHolder>(){

    var onSuraClicklisenner : onItemClickLisenner? = null

    class SuraNameViewHolder(itemview : View) : ViewHolder(itemview)
    {
        val suraname : TextView = itemview.findViewById(R.id.sura_name)
        val number : TextView = itemview.findViewById(R.id.num_name)
        var suraImage : ImageView = itemview.findViewById(R.id.sura_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraNameViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sura_name,
                parent,
                false)
        return SuraNameViewHolder(view)
    }

    override fun getItemCount(): Int = suranames.size


    override fun onBindViewHolder(holder: SuraNameViewHolder, position: Int) {
        val suraName = suranames[position].name
        val suraNum = suranames[position].num
        var image = suranames[position].image
        holder.suraname.text = suraName.toString()
        holder.number.text = suraNum.toString()
        holder.suraImage.setImageResource(image)
          holder.itemView.setOnClickListener {
              onSuraClicklisenner?.onClick(suraName.toString(),position)
          }
        }
    interface onItemClickLisenner{
        fun onClick(sura:String,index:Int)
    }

    }
