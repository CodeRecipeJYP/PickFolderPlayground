package com.asuscomm.yangyinetwork.pickfolderplayground

import android.support.v4.graphics.drawable.DrawableCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_folder.view.*

class FolderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.iv_folder.setImageDrawable(itemView.iv_folder.drawable.mutate())
    }

    fun configure(folder: Folder) {
        DrawableCompat.setTint(itemView.iv_folder.drawable, FOLDER_COLOR.get(folder.color)!!)
        itemView.tv_foldername.text = folder.name
    }
}
