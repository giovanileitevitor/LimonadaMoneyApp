package com.example.limonadamoneyapp.utils

import android.content.Context
import android.icu.text.SimpleDateFormat
import androidx.core.content.ContextCompat
import com.example.limonadamoneyapp.R
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import java.util.*

fun getDate(): String {
    val cal = Calendar.getInstance()
    val sdf = SimpleDateFormat("dd - MM - YYYY")
    return sdf.format(cal.time)
}

fun getDateTime(): String {
    val cal = Calendar.getInstance()
    val sdf = SimpleDateFormat("hh:mm:ss")
    return sdf.format(cal.time)
}

fun getDateTimeFull(): String {
    val cal = Calendar.getInstance()
    val sdf = SimpleDateFormat("dd / MM / YYYY - - - hh:mm:ss")
    return sdf.format(cal.time)
}