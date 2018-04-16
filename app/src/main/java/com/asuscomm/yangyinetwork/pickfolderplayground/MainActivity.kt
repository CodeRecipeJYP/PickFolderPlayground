package com.asuscomm.yangyinetwork.pickfolderplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.apply {
            adapter = FolderAdapter().apply {
                mItems = ArrayList<Folder>(
                        FOLDER_COLOR.map { (colorName, value) ->
                            Folder(colorName, "colorName=$colorName")
                        }
                )
            }

            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}
