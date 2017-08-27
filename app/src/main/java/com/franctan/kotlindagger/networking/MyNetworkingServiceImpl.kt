package com.franctan.kotlindagger.networking

import com.franctan.kotlindagger.MyApp

class MyNetworkingServiceImpl constructor(private val app: MyApp) : MyNetworkingService {
    override fun getAll(): List<Int> {
        return listOf(1, 2, 3, 4, 5, 6)
    }
}


