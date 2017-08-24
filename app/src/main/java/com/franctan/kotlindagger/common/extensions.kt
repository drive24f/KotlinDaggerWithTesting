package com.franctan.kotlindagger.common


fun Any.pretty(): String {
    val pretty = "${this.javaClass.simpleName} (${this.hashCode()})"
    return pretty
}