package com.example.demopagination

import android.location.Location
import android.webkit.WebStorage

data class Results(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: WebStorage.Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)
