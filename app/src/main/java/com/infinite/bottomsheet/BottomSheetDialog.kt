package com.infinite.bottomsheet

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.BottomSheetDialogFragment
import android.support.design.widget.CoordinatorLayout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast

/**
 * Created by kfzhangxu on 2018/1/29.
 */

class BottomSheetDialog : BottomSheetDialogFragment() {

    companion object {
        val TAG = BottomSheetDialog::javaClass.name
    }


    override fun setupDialog(dialog: Dialog, style: Int) {
//        super.setupDialog(dialog, style)

        val view = LayoutInflater.from(context).inflate(R.layout.fragment_bottom_sheet, null)
        dialog.setContentView(view)

        val params = (view.parent as View).layoutParams as CoordinatorLayout.LayoutParams
        val behavior = params.behavior

        if (behavior != null && behavior is BottomSheetBehavior<*>) {
            behavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {

                    when (newState) {
                        BottomSheetBehavior.STATE_DRAGGING -> {
                            Log.d(TAG,"STATE_DRAGGING")
                        }
                        BottomSheetBehavior.STATE_SETTLING -> {
                            Log.d(TAG,"STATE_SETTLING")
                        }
                        BottomSheetBehavior.STATE_EXPANDED -> {
                            Log.d(TAG,"STATE_EXPANDED")
                        }
                        BottomSheetBehavior.STATE_COLLAPSED -> {
                            Log.d(TAG,"STATE_COLLAPSED")
                        }
                        BottomSheetBehavior.STATE_HIDDEN -> {
                            dismiss()
                            Log.d(TAG,"STATE_HIDDEN")
                        }
                    }

                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {}
            })
        }
    }
}
