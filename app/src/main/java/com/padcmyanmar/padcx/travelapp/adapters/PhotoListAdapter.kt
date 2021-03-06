package com.padcmyanmar.padcx.travelapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.travelapp.R
import com.padcmyanmar.padcx.travelapp.views.viewholder.PhotoViewHolder

/**
 * Created by Phyoe Sandy Soe Tun
 * on 2/20/2020.
 */
class PhotoListAdapter : BaseRecyclerAdapter<PhotoViewHolder,String>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photos,parent,false)
        return PhotoViewHolder(view)
    }
}