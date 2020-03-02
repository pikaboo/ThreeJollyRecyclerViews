package com.lenabru.recyclerviewtest

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Lena Brusilovski on 02/03/2020
 */
open class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val textView: TextView = view.findViewById(R.id.textView)

    fun bind(text: String){
        textView.text = text
    }
}