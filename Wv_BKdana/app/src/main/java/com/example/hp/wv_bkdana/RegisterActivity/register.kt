package com.example.hp.wv_bkdana.RegisterActivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hp.wv_bkdana.R
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        btn_mikro.setOnClickListener {
            startActivity(Intent(this, regis_peminjam_mikro::class.java))
        }

        btn_kilat.setOnClickListener {
            startActivity(Intent(this, register_peminjam_kilat::class.java))
        }
    }
}
