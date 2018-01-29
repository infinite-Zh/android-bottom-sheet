package com.infinite.bottomsheet

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottom_sheet.*

/**
 * Created by kfzhangxu on 2018/1/29.
 */

class BottomSheetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)
        val behavior=BottomSheetBehavior.from(nestedScrollview)

        btn_open.setOnClickListener({
            behavior.state=BottomSheetBehavior.STATE_EXPANDED
        })

        btn_close.setOnClickListener({
            behavior.state=BottomSheetBehavior.STATE_COLLAPSED
        })

    }
}
