package com.ironclad.samplesnat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ironclad.snat.SnatSnackbar
import com.ironclad.snat.SnatToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToastShort.setOnClickListener {
            SnatToast.toastDefault(this, "Test for Toast Short", 0)
        }

        btnToastLong.setOnClickListener {
            SnatToast.toastDefault(this, "Test for Toast Long", 1)
        }

        btnSnackbarShort.setOnClickListener {
            SnatToast.positionedToast(this, "Top", 1, 1, 300, 0)
        }

        btnSnackbarLong.setOnClickListener {
            SnatToast.positionedToast(this, "Bottom", 1, 2, 200, 0)
        }
    }
}
