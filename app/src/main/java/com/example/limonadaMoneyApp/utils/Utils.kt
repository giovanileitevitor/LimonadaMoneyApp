package com.example.limonadaMoneyApp.utils

import android.app.Activity
import android.icu.text.SimpleDateFormat
import android.util.Log
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

fun printLog(activity : Activity, tag: String, log : String){
    Log.i(tag, log)
}

