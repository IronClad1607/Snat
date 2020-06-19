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
            SnatSnackbar.snackbarShort(llContainer, "Test for Snackbar")
        }

        btnSnackbarLong.setOnClickListener {
            SnatSnackbar.snackbarLong(llContainer, "Test for Snackbar Long")
        }
    }
}
