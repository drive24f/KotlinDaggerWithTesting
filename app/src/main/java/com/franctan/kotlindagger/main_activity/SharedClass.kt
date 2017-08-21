package com.franctan.kotlindagger.main_activity

import java.util.*


class SharedClass constructor() {

    val random: Int

    init {
        random = Random().nextInt()
    }


}