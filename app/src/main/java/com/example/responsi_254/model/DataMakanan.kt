package com.example.responsi_254.model

import com.example.responsi_254.R

object DataMakanan {
    private val makananName = arrayOf(
        "Sushi",
        "Nasi Goreng Cumi",
        "Susu Farm House",
        "Jajanan",
        "Cumi Bakar",
        "Starbucks",
        "Ice Cream",
        "Durian",
        "Susu Floating Market",
        "Nasi Ikan & Cumi"
    )

    private val detail = arrayOf(
        "Sushi adalah makanan khas Jepang",
        "Nasi Goreng Cumi berada di Jakal KM4",
        "Susu Farm House berasal dari Bandung",
        "Jajanan ini merupakan hadiah ketika Pengabdian Masyarakat",
        "Cumi Bakar bisa ditemui di Sekaten",
        "Starbucks adalah kopi mehong",
        "Ice Cream adalah favorite saya",
        "Durian adalah kenikmatan yang haqiqi",
        "Susu Floating Market berasal dari Bandung juga",
        "Nasi Ikan & Cumi bisa dibeli di Selokan Mataram"
    )

    private val makananPoster = intArrayOf(
        R.drawable.poto1,
        R.drawable.poto2,
        R.drawable.poto3,
        R.drawable.poto4,
        R.drawable.poto5,
        R.drawable.poto6,
        R.drawable.poto7,
        R.drawable.poto8,
        R.drawable.poto9,
        R.drawable.poto10
    )

    val listMakanan:ArrayList<Makanan>
    get() {
        val list = arrayListOf<Makanan>()
        for(position in makananName.indices){
            val makanan = Makanan()
            makanan.name = makananName[position]
            makanan.detail = detail[position]
            makanan.poster = makananPoster[position]
            list.add(makanan)
        }
        return list
    }
}