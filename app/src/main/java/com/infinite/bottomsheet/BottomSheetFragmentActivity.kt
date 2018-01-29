package com.infinite.bottomsheet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottom_sheet_fragment.*


/**
 * Created by kfzhangxu on 2018/1/29.
 */
class BottomSheetFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet_fragment)
        btn_open.setOnClickListener({
            val dialog = BottomSheetDialog()
            dialog.show(supportFragmentManager, "abc")
        })
    }
}