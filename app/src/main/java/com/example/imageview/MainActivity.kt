package com.example.imageview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    private val names = arrayOf(
        "Tejashree DL",
        "Tharun",
        "Swathi",
        "Dhriti",
        "Harshini",
        "Charitha"
    )

    private val usns = arrayOf(
        "25MCAR0124",
        "25MCAR0101",
        "25MCAR0102",
        "25MCAR0103",
        "25MCAR0104",
        "25MCAR0105"
    )

    private val courses = arrayOf(
        "MCA",
        "MCA",
        "MCA",
        "MCA",
        "MCA",
        "MCA"
    )

    private val subjects = arrayOf(
        "Android Development",
        "Database Management",
        "Web Development",
        "Cloud Computing",
        "Artificial Intelligence",
        "Software Engineering"
    )

    private val images = intArrayOf(
        android.R.drawable.ic_menu_myplaces,
        android.R.drawable.ic_menu_agenda,
        android.R.drawable.ic_menu_edit,
        android.R.drawable.ic_menu_upload,
        android.R.drawable.ic_menu_search,
        android.R.drawable.ic_menu_manage
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val adapter = CustomAdapter(
            this,
            names,
            usns,
            courses,
            subjects,
            images
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->

            Toast.makeText(
                this,
                "${names[position]} selected",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}