package com.example.jobshet15dayah

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "aplikasi berjalan", Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.tombolToast)

        tombol.setOnClickListener {
            Toast.makeText(this, "Nor hidayah fitriyani", Toast.LENGTH_SHORT).show()

            val tombolkls = findViewById<Button>(R.id.tombolKELAS)

            tombolkls.setOnClickListener {
                Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()

                val tombolnis = findViewById<Button>(R.id.tombolnis)
                tombolnis.setOnClickListener {
                    Toast.makeText(this, "3020", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}