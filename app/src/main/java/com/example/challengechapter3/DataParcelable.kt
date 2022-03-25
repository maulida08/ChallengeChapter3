package com.example.challengechapter3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataParcelable(val ordoAwal: Int, val ordoAkhir: Int, val kapTangki: Double ) :Parcelable