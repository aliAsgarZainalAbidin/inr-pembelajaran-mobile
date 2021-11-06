package com.inready_workgroup.activityapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPindah : Button = findViewById(R.id.btn_main_pindah)
        btnPindah.setOnClickListener {
            val pindahActivity = Intent(this, DetailActivity::class.java)
            startActivity(pindahActivity)
        }
    }

}