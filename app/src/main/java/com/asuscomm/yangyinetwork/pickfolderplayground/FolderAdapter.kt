package com.asuscomm.yangyinetwork.pickfolderplayground

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


class FolderAdapter : RecyclerView.Adapter<FolderViewHolder>() {
    var mItems: List<Folder> = emptyList()
        set(value) {
            field = value
            this.notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FolderViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_folder, parent, false)

        return FolderViewHolder(v)
    }

    override fun onBindViewHolder(holder: FolderViewHolder, position: Int) {
        holder.configure(mItems[position])
    }

    override fun getItemCount(): Int {
        return mItems.size
    }
}