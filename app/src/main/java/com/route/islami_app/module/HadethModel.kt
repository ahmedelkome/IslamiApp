package com.route.islami_app.module

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HadethModel(var title : String,var content :String) :  Parcelable
