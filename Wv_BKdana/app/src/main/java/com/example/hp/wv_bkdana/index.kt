package com.example.hp.wv_bkdana

import android.app.AlertDialog

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_index.*
import android.widget.Button
import com.example.hp.wv_bkdana.RegisterActivity.register
import com.example.hp.wv_bkdana.RegisterActivity.register_pendana


class index : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        btn_homepage.setOnClickListener {
            startActivity(Intent(this, homepage::class.java))

        }

        btnLogin.setOnClickListener {
            startActivity(Intent(this, login::class.java))
        }

        btn_bkdinfo.setOnClickListener {
            startActivity(Intent(this, tentangkami::class.java))
        }
        etRegis.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            // Seems ok to inflate view with null rootView
            val view = layoutInflater.inflate(R.layout.dialogue, null)
            builder.setView(view)
            val testingss = view.findViewById<Button>(R.id.daftar_pinjam)
            val testingss1 = view.findViewById<Button>(R.id.daftar_pendana)
            val testingss2 = view.findViewById<Button>(R.id.back)
            testingss.setOnClickListener {
                startActivity(Intent(this, register::class.java))
            }
            testingss1.setOnClickListener {
                startActivity(Intent(this, register_pendana::class.java))
            }
            testingss2.setOnClickListener {
                startActivity(Intent(this, index::class.java))
                finish()
            }

            builder.show()


        }
    }
    



}
