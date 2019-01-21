package com.example.kotlintest2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.bottom_fragment.*

class BottomSectionFragment : Fragment() {

    var topTextSecond: TextView? =null
    var bottomTextSecond: TextView? =null
    //lateinit var bottomTextSecond: TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater?.inflate(
            R.layout.bottom_fragment,
            container, false
        )

        topTextSecond = view.findViewById(R.id.textTop_bottomFragment)
        bottomTextSecond = view.findViewById(R.id.textBottom_bottomFragment)

        topTextSecond?.setText("Bye")
        return view
    }

    fun populateMemeInSecondFragment(top: String, bottom: String){
        Log.d("tag", "Reached bottom fragment")
        topTextSecond?.setText("gross")
        topTextSecond?.text = "out"
        Log.d("tag", "This is top message: " +top + topTextSecond?.text.toString())
        bottomTextSecond?.setText(bottom)
        //bottomTextSecond.text = "bye"
        Log.d("tag", "This is bottom message: " +bottom+bottomTextSecond?.text.toString())
       // val s: String = textTop_bottomFragment.text.toString()
  
    }
}