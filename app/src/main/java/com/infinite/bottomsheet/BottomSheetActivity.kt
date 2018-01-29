package com.infinite.bottomsheet

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_bottom_sheet.*

/**
 * Created by kfzhangxu on 2018/1/29.
 */

class BottomSheetActivity : AppCompatActivity() {

    companion object {
        val TAG = BottomSheetActivity.javaClass.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)
        val behavior = BottomSheetBehavior.from(nestedScrollview)
        behavior.peekHeight = 200
        btn_open.setOnClickListener({
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        })

        btn_close.setOnClickListener({
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        })

        behavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> Log.d(TAG,"STATE_COLLAPSED")
                    BottomSheetBehavior.STATE_EXPANDED -> Log.d(TAG,"STATE_EXPANDED")
                    BottomSheetBehavior.STATE_DRAGGING -> Log.d(TAG,"STATE_DRAGGING")
                    BottomSheetBehavior.STATE_HIDDEN -> Log.d(TAG,"STATE_HIDDEN")
                    BottomSheetBehavior.STATE_SETTLING -> Log.d(TAG,"STATE_SETTLING")
                }
            }
        })
    }
}
