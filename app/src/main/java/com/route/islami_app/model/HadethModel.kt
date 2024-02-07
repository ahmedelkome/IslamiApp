package com.route.islami_app.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HadethModel(var title : String,var content :String) :  Parcelable
