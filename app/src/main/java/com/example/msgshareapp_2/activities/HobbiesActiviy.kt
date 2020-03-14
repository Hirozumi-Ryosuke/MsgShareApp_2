package com.example.msgshareapp_2.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.msgshareapp_2.adapters.HobbiesAdapter
import com.example.msgshareapp_2.R
import com.example.msgshareapp_2.models.Suplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActiviy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Suplier.hobbies)
        recyclerView.adapter = adapter
    }
}

