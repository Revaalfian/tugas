package com.uty.mylistview2.model

import com.uty.mylistview2.R

object FootData {
    private val foodName = arrayOf(
        "nasi goreng",
        "rendang",
        "mie goreng",
        "telur ceplok",
        "bakso",
        "getuk",
        "gudeg",
        "iwak",
        "nasi")

        private val detail = arrayOf(
       "nasi goreng adalah nasi yang di goreng",
            "rendang adalah daging yang di rendang",
            "mie goreng adalah mie yang di goreng",
            "telur ceplok adalah teur yang di ceplok",
            "sate adalah daging yang di bakar"
            "bakso adalah daging yang di bakar"
            "getuk adalah daging yang di bakar"
            "gudeg adalah daging yang di bakar"
            "iwak adalah daging yang di bakar"
            "nasi adalah daging yang di bakar")

    private val foodPoster = intArrayOf(
        R.drawable.nasgor,
        R.drawable.rendang,
        R.drawable.mie,
        R.drawable.ndog,
        R.drawable.sate,
        R.drawable.bakso,
        R.drawable.getuk,
        R.drawable.gudeg,
        R.drawable.iwak,
        R.drawable.nasi
    )

    val listFood: ArrayList<Food>
    get(){
        val list = arrayListOf<Food>()
        for (position in foodName.indices){
            val food = Food()
            food.name = foodName[position]
            food.detail = detail[position]
            food.poster = foodPoster[position]
            list.add(food)
        }
        return list
    }
}