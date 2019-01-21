package com.example.kotlintest2

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.top_fragment.view.*


class TopSectionFragment : Fragment() {

    lateinit var textAtTop: EditText
    lateinit var textAtBottom: EditText
    lateinit var button: Button

    lateinit var listener: memeInterface

    interface memeInterface{
        fun topFragToMain(top: String, bottom: String)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater?.inflate(
            R.layout.top_fragment,
            container, false
        )
        textAtTop = view?.findViewById(R.id.textTop) as EditText
        textAtBottom = view?.findViewById(R.id.textBottom) as EditText
        button = view?.findViewById(R.id.button)

        button.setOnClickListener{
            init(view)
        }
        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is memeInterface) {
            listener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement FragmentEvent")
        }
    }

    fun init(view: View){
        listener.topFragToMain(textAtTop.text.toString(), textAtBottom.text.toString())
    }


}