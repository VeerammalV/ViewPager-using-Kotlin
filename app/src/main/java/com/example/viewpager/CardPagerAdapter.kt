package com.example.viewpager

import CardItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.PagerAdapter

class CardPageAdapter(private val context: Context, private val cardItems: List<CardItem>) :  PagerAdapter() {
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view =
            LayoutInflater.from(context).inflate(R.layout.card_item, container, false)
        val textView = view.findViewById<TextView>(R.id.text_view)
        textView.text = cardItems[position].text
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as CardView)
    }

    override fun getCount(): Int {
        return cardItems.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

}