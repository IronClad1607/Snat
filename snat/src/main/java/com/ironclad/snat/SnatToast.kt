package com.ironclad.snat

import android.content.Context
import android.widget.Toast
import java.time.Duration

class SnatToast {
    companion object {
        public fun toastDefault(context: Context, message: String, duration: Int) {
            when (duration) {
                1 -> {
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                }
                0 -> {
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(context, "Duration is wrong", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}