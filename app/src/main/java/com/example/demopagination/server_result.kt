package com.example.demopagination

import android.icu.text.IDNA

data class server_result(
    val info: IDNA.Info,
    val results: List<Results>
)
