package com.ruzibekov.todolist_uz.presentation.fragments.focus_mode

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ruzibekov.todolist_uz.R
import com.ruzibekov.todolist_uz.models.ApplicationTime
import kotlinx.android.synthetic.main.item_application.view.*

class ApplicationTimeAdapter(private val applicationTimes: ArrayList<ApplicationTime>) :
    RecyclerView.Adapter<ApplicationTimeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.item_application, parent, false))

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.appImage.setImageResource(applicationTimes[position].appImage)
        holder.itemView.appName.text = applicationTimes[position].appName
        holder.itemView.appTime.text =
            "You spent ${applicationTimes[position].appTime} " +
                "on ${applicationTimes[position].appName} today "
    }

    override fun getItemCount() = applicationTimes.size
}