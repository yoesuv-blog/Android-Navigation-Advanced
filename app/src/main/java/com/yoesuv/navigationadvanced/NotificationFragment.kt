package com.yoesuv.navigationadvanced

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_notification.view.*

class NotificationFragment: Fragment() {

    private var listData: MutableList<String> = mutableListOf()
    private lateinit var adapter: NotificationAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        view.recyclerViewFragmentNotification.layoutManager = layoutManager

        for (i:Int in 0..100){
            listData.add("Item Notification $i")
        }
        adapter = NotificationAdapter(listData)
        view.recyclerViewFragmentNotification.adapter = adapter
    }

}