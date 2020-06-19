package com.ironclad.snat

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.Gravity
import android.widget.Toast


class SnatToast {
    companion object {
        private val TAG = "SnatToast"
        fun toastDefault(context: Context, message: String, duration: Int) {
            when (duration) {
                1 -> {
                    Log.d(TAG, "Long Toast")
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                }
                0 -> {
                    Log.d(TAG, "Short Toast")
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Log.d(TAG, "Illegal Duration")
                    Toast.makeText(context, "Duration is wrong", Toast.LENGTH_LONG).show()
                }
            }
        }

        @SuppressLint("RtlHardcoded")
        fun positionedToast(
            context: Context,
            message: String,
            duration: Int,
            gravity: Int,
            xOffSet: Int,
            yOffSet: Int
        ) {
            var toast = Toast(context)
            when (duration) {
                1 -> {
                    Log.d(TAG, "Long Toast")
                    toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
                }
                0 -> {
                    Log.d(TAG, "Short Toast")
                    toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
                }
            }

            toast.apply {
                when (gravity) {
                    1 -> {
                        Log.d(
                            TAG,
                            "Gravity set as TOP with ${xOffSet.toString()} and ${yOffSet.toString()}"
                        )
                        setGravity(Gravity.TOP, xOffset, yOffset)
                    }

                    2 -> {
                        Log.d(
                            TAG,
                            "Gravity set as BOTTOM with ${xOffSet.toString()} and ${yOffSet.toString()}"
                        )
                        setGravity(Gravity.BOTTOM, xOffset, yOffset)
                    }

                    3 -> {
                        Log.d(
                            TAG,
                            "Gravity set as LEFT with ${xOffSet.toString()} and ${yOffSet.toString()}"
                        )
                        setGravity(Gravity.LEFT, xOffset, yOffset)
                    }

                    4 -> {
                        Log.d(
                            TAG,
                            "Gravity set as RIGHT with ${xOffSet.toString()} and ${yOffSet.toString()}"
                        )
                        setGravity(Gravity.RIGHT, xOffset, yOffset)
                    }
                }

                show()
            }
        }
    }
}