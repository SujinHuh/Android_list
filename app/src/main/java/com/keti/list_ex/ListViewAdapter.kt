package com.keti.list_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, converView: View?, parent: ViewGroup?): View {
        /**layout-> listView_item 에서 데이터를 가져오는 부분 */
        var converView = converView

        //item을 가져오는 부분
        if (converView == null) {
            converView =
                LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }
        val title = converView!!.findViewById<TextView>(R.id.listviewItem)
        title.text = List[position]
        return converView!!

    }
}