package com.will.recycleview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnRV : Button
    private lateinit var  btnRM : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnRV = findViewById(R.id.btnRV)
        btnRM = findViewById(R.id.btnRM)

        btnRM.setOnClickListener()
        {
            val intentMenu2 = Intent(this@MainActivity,
                MovieActivity::class.java)
            startActivity(intentMenu2)
        }

        btnRV.setOnClickListener()
        {
            val intentMenu2 = Intent(this@MainActivity,
                RecycleViewActivity::class.java)
            startActivity(intentMenu2)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}