package com.will.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.will.recycleview.adapter.BukuAdapter
import com.will.recycleview.model.ModelBuku

private lateinit var rev_data : RecyclerView
class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rev_data = findViewById(R.id.rv_data)

        //kita array list
        val listBuku = listOf(
            ModelBuku(judul = "Laskar Pelangi ", penulis = "– Andrea Hirata"),
            ModelBuku(judul = "Gadis Kretek", penulis = "Ratih Kumala"),
            ModelBuku(judul = "Negeri 5 Menara", penulis = "Ahmad Fuadi"),
            ModelBuku(judul = "Bumi Manusia ", penulis = "Pramoedya Ananta Toer"),
            ModelBuku(judul = "Amba", penulis = "Laksmi Pamuntjak"),
            ModelBuku(judul = "Bumi ", penulis = "Tere Liye"),
            ModelBuku(judul = "Ayat-Ayat Cinta", penulis = " Habiburahman El Shirazy"),

            )

        //baru kita set adapter
        val nBukuAdapter = BukuAdapter(listBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}