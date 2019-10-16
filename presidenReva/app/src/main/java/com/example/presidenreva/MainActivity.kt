package com.example.presidenreva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.presidenreva.model.data
import com.example.presidenreva.model.presiden

class MainActivity : AppCompatActivity() {
    private lateinit var rvpresiden: RecyclerView
    private var urut: ArrayList<presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvpresiden = findViewById(R.id.rv_presiden)
        rvpresiden.setHasFixedSize(true)
        urut.addAll(data.urut_presiden)
        showurut_presiden()
    }
    private fun showurut_presiden() {
        rvpresiden.layoutManager = LinearLayoutManager(this)
        rvpresiden.adapter = urut_presiden(this, urut) {
            Toast.makeText(this, it.detail, Toast.LENGTH_SHORT).show();
        }
    }
}
