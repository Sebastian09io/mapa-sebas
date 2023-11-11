package com.example.reciclerview.data

import com.example.reciclerview.R
import com.example.reciclerview.model.RecyclerData

class DataSource {
    fun loadAffirmations(): List<RecyclerData>{
        return listOf<RecyclerData>(
            RecyclerData(R.string.title1,R.drawable.kotlin),
            RecyclerData(R.string.title2,R.drawable.java),
            RecyclerData(R.string.title3,R.drawable.node),
            RecyclerData(R.string.title4,R.drawable.cplus),
            RecyclerData(R.string.title5, R.drawable.python),
            RecyclerData(R.string.title1,R.drawable.kotlin),
            RecyclerData(R.string.title2,R.drawable.java),
            RecyclerData(R.string.title3,R.drawable.node),
            RecyclerData(R.string.title4,R.drawable.cplus),
            RecyclerData(R.string.title5, R.drawable.python),
            RecyclerData(R.string.title1,R.drawable.kotlin),
            RecyclerData(R.string.title2,R.drawable.java),
            RecyclerData(R.string.title3,R.drawable.node),
            RecyclerData(R.string.title4,R.drawable.cplus),
            RecyclerData(R.string.title5, R.drawable.python),
            )
    }
}