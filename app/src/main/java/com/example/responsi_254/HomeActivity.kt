package com.example.responsi_254

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi_254.adapter.ListMakananAdapter
import com.example.responsi_254.model.DataMakanan
import com.example.responsi_254.model.Makanan

class HomeActivity : AppCompatActivity() {
    private lateinit var rv_makanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rv_makanan = findViewById(R.id.rv_makanan)
        rv_makanan.setHasFixedSize(true)
        list.addAll(DataMakanan.listMakanan)
        showMakananList()
    }

    private fun showMakananList() {
        rv_makanan.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter = ListMakananAdapter(list)
        rv_makanan.adapter = listMakananAdapter
    }
}
