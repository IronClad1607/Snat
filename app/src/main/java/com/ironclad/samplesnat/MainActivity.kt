package com.ironclad.samplesnat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ironclad.snat.SnatToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToastShort.setOnClickListener {
        }
    }
}
