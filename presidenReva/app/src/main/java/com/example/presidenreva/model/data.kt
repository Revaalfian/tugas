package com.example.presidenreva.model

import com.example.presidenreva.R

object data {
    private val Nama_Presiden = arrayOf(
        "Soekarno",
        "Soeharto",
        "Habibie",
        "Gus dur",
        "Megawati Sukarno Putri",
        "SBY",
        "Jokowi"
    )

    private val detail = arrayOf(
        "Soekarno adalah presiden pertama indonesia yang memerdekan indonesia",
        "Soeharto adalah presiden kedua indonesia setalah soekarno",
        "Bj Habibie adalah presiden ketiga indonesia yang disebut bapak teknologi",
        "Abdurrahman Wahid atau gusdur adalah presiden ke empat indonesia",
        "Megawati adalah presiden kelima indonesia dan anak dari soekarno",
        "SBY adalah presiden ke enam indonesia",
        "Joko Widodo adalah presiden ke tujuh indonesia"
    )

    private val PresidenPoster = intArrayOf(
        R.drawable.karno,
        R.drawable.harto,
        R.drawable.habibie,
        R.drawable.gsssdur,
        R.drawable.mega,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val urut_presiden: ArrayList<com.example.presidenreva.model.presiden>
        get() {
            val list = arrayListOf<com.example.presidenreva.model.presiden>()
            for (position in Nama_Presiden.indices) {
                val Presiden = com.example.presidenreva.model.presiden()
                Presiden.name = Nama_Presiden[position]
                Presiden.detail = detail[position]
                Presiden.poster = PresidenPoster[position]
                list.add(Presiden)
            }
            return list
        }
}