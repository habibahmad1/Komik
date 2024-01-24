package com.example.komik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Ini Terima data dari intent
        val selectedHero = intent.getParcelableExtra<Hero>("selectedHero")

        // Ini Tampilkan data di UI
        val tvName: TextView = findViewById(R.id.nama_komik)
        val tvDescription: TextView = findViewById(R.id.desc_komik)
        val imgPhoto: ImageView = findViewById(R.id.foto)

        tvName.text = selectedHero?.name
        tvDescription.text = selectedHero?.description
        imgPhoto.setImageResource(selectedHero?.photo ?: 0)

        supportActionBar?.title = selectedHero?.name ?: getString(R.string.detail_title)
    }
}