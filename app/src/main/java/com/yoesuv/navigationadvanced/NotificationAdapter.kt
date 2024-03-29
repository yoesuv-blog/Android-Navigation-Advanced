package com.yoesuv.navigationadvanced

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_notification.view.*

class NotificationAdapter(private var listString: MutableList<String>, val itemClickListener: (String) -> Unit): RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification, parent, false)
        return NotificationViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listString.size
    }

    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val strData = listString[holder.adapterPosition]
        holder.bindData(strData)
        holder.itemView.setOnClickListener {
            itemClickListener(strData)
        }
    }

    class NotificationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(message: String) {
            itemView.textViewItemNotification.text = message
        }
    }

}