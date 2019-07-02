package com.yoesuv.navigationadvanced

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_notification_detail.view.*

class NotificationDetailFragment: Fragment() {

    private val args: NotificationDetailFragmentArgs by navArgs()
    private var sampleDataModel: SampleDataModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        sampleDataModel = args.dataDetailNotification
        return inflater.inflate(R.layout.fragment_notification_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).hideNavigation(true)
        view.textViewNotificationDetail.text = sampleDataModel?.value
    }

    override fun onDestroy() {
        super.onDestroy()
        (activity as MainActivity).hideNavigation(false)
    }

}