package com.jazz.kotlinDemo.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.jazz.kotlinDemo.R

/**
 * Created by xinggang_yin on 2018/2/27 0027.
 * description ${TODO}
 * <p>
 *  Changed by somebody on 2018/2/27 0027
 * description ${TODO}
 */
class MainAdapter(list:List<String>?,ct: Context): BaseAdapter(){
    var context: Context
    var mData: List<String>?
    init {
        context = ct
        mData = list
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return convertView?:LayoutInflater.from(context).inflate(R.layout.main_item_layout,null).also {
            with(it.findViewById(R.id.text) as TextView){
                text = mData!![position]
            }
            it.findViewById<TextView>(R.id.text1).run {
                text = mData!![position]
            }
        }

    }

    override fun getItem(position: Int): Any {
        return mData!![position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mData?.size?:0
    }

    class MyHolder(itemView: View){
        var text = itemView.findViewById<TextView>(R.id.text)
    }

}