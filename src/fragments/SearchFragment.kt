package com.example.myapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.FrameLayout
import android.view.Gravity
import android.graphics.Color

class SearchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val textView = TextView(activity)
        textView.text = "Search"
        textView.textSize = 24f
        textView.setTextColor(Color.BLACK)
        textView.gravity = Gravity.CENTER
        val layout = FrameLayout(activity!!)
        layout.addView(textView)
        return layout
    }
}
