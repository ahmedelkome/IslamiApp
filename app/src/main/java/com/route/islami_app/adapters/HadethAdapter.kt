package com.route.islami_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.route.islami_app.R
import com.route.islami_app.module.HadethModel

class HadethAdapter(val Hadeths : List<HadethModel>): RecyclerView.Adapter<HadethAdapter.HadethNameViewHolder>(){

    var onhadethClicklisenner : onItemClickLisenner? = null

    class HadethNameViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview)
    {
        val hadethName : TextView = itemview.findViewById(R.id.hadeth_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadethNameViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_ahadeth,
                parent,
                false)
        return HadethNameViewHolder(view)
    }

    override fun getItemCount(): Int = Hadeths.size


    override fun onBindViewHolder(holder:HadethNameViewHolder, position: Int) {
        val titel = Hadeths[position].title
        holder.hadethName.text = titel
        holder.itemView.setOnClickListener {
            onhadethClicklisenner?.onClick(Hadeths[position],position)
        }
    }
    interface onItemClickLisenner{
        fun onClick(hadeth:HadethModel,index:Int)
    }

}