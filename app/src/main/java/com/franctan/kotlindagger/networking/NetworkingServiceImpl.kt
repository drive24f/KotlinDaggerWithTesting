package com.franctan.kotlindagger.networking

class NetworkingServiceImpl() : NetworkingService {
    override fun getAll(): List<Int> {
        return listOf(1, 2, 3, 4, 5, 6)
    }
}


