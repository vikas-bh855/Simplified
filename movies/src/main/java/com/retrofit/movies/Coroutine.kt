package com.retrofit.movies

private const val TAG = "Coroutine"

fun main(args: Array<String>) {
    val input = generateSequence(::readLine)
    val lines = input.toList()
    for (i in lines.lastIndex downTo 1) {
        println(lines[i])

    }
}

