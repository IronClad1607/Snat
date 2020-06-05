package com.ironclad.snat

import android.view.View
import com.google.android.material.snackbar.Snackbar

class SnatSnackbar {
    fun snackbarShort(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

    fun snackbarLong(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
    }
}