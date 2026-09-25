package com.example.imageview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(
    private val context: Context,
    private val names: Array<String>,
    private val usns: Array<String>,
    private val courses: Array<String>,
    private val subjects: Array<String>,
    private val images: IntArray
) : BaseAdapter() {

    private val inflater: LayoutInflater =
        LayoutInflater.from(context)

    override fun getCount(): Int {
        return names.size
    }

    override fun getItem(position: Int): Any {
        return names[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val view = convertView ?: inflater.inflate(
            R.layout.list_item,
            parent,
            false
        )

        val itemImage = view.findViewById<ImageView>(
            R.id.itemImage
        )

        val itemTitle = view.findViewById<TextView>(
            R.id.itemTitle
        )

        val itemUSN = view.findViewById<TextView>(
            R.id.itemUSN
        )

        val itemCourse = view.findViewById<TextView>(
            R.id.itemCourse
        )

        val itemSubject = view.findViewById<TextView>(
            R.id.itemSubject
        )

        itemImage.setImageResource(images[position])

        itemTitle.text = names[position]

        itemUSN.text = "USN: ${usns[position]}"

        itemCourse.text = "Course: ${courses[position]}"

        itemSubject.text = "Subject: ${subjects[position]}"

        return view
    }
}