package com.lenabru.recyclerviewtest

import android.view.View

/**
 * Created by Lena Brusilovski on 02/03/2020
 */
class ViewHolderFactory {
    companion object {
        fun create(view: View, viewType: Int): ViewHolder {
            return when (viewType) {
                R.layout.list_item_text -> ViewHolder(view)
                R.layout.list_item_header -> HeaderViewHolder(view)
                else -> ViewHolder(view)
            }
        }
    }
}