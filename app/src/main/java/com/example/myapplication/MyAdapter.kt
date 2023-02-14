package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.net.wifi.ScanResult
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter


import android.widget.BaseAdapter
import android.widget.TextView

/*    var ssid: String,
    var bssid: String,
    var level: String,
    var frequency: Int,
    var timestamp: Long,
    var distance: String,*/

class MyAdapter(private val context: Activity, private val arrayList: java.util.ArrayList<ScanResult>) : ArrayAdapter<ScanResult>(context,
          R.layout.list_view_item, arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context);
        val view : View = inflater.inflate(R.layout.list_view_item, null);

        val ssid : TextView = view.findViewById(R.id.ssid);
        val bssid : TextView = view.findViewById(R.id.bssid);
        val level : TextView = view.findViewById(R.id.level);
        val frequency : TextView = view.findViewById(R.id.frequency);
        val timestamp : TextView = view.findViewById(R.id.timestamp);

        ssid.text = "SSID: " + arrayList[position].SSID;
        bssid.text = "BSSID: " + arrayList[position].BSSID;
        level.text = "Level: " + arrayList[position].level.toString();
        frequency.text = "Frequency: " + arrayList[position].frequency.toString();
        timestamp.text = "Timestamp: " + arrayList[position].timestamp.toString();


        return view;
    }
}