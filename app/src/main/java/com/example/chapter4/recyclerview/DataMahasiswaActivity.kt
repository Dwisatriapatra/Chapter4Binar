package com.example.chapter4.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_data_mahasiswa.*

class DataMahasiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val datamahasiswa = arrayListOf(
            DataMahasiswa(R.drawable.ic_launcher_background, "Ani", "23"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Patra", "22"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Dimas", "19"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Ganda", "19"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Alan", "21"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Aji", "22"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Dewi", "21"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Putri", "24"),
            DataMahasiswa(R.drawable.ic_launcher_background, "Najwa", "20"),
        )
        val adapterMahasiswa = AdapterMahasiswa(datamahasiswa)
        val layoutmanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_mahasiswa.layoutManager = layoutmanager
        rv_mahasiswa.adapter = adapterMahasiswa
    }
}