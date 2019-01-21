package com.example.kotlintest2

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TopSectionFragment.memeInterface{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun topFragToMain(top: String, bottom: String) {
        hideSoftKeyboard()
        Log.d("tag", "Going to main activity")
        val myFragmentMain =  BottomSectionFragment()
        myFragmentMain.populateMemeInSecondFragment(top, bottom)
    }

    private fun hideSoftKeyboard() {
        val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }
}
