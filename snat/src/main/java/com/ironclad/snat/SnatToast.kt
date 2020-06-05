package com.ironclad.snat

import android.content.Context
import android.widget.Toast

class SnatToast {
    companion object{
        public fun toastShort(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        public fun toastLong(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}