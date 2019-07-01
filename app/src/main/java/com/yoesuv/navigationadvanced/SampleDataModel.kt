package com.yoesuv.navigationadvanced

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Parcelize
@Keep
data class SampleDataModel (val value: String?): Parcelable