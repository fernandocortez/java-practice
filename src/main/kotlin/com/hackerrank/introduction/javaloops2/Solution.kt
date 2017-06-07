package com.hackerrank.introduction.javaloops2

import java.util.*

fun main(args: Array<String>) {
  val `in` = Scanner(System.`in`)
  val t = `in`.nextInt()

  val series = ArrayList<Int>()

  for (i in 0..t - 1) {
    series.clear()

    val a = `in`.nextInt()
    val b = `in`.nextInt()
    val n = `in`.nextInt()

    for (exp in 0..n - 1) {
      val term = expansion(a, b, exp)
      series.add(term)
    }

    for (term in series) {
      System.out.printf("%d ", term)
    }
    println()
  }

  `in`.close()
}

private fun expansion(a: Int, b: Int, exp: Int): Int {
  if (exp < 1) {
    return a + b
  }
  return Math.pow(2.0, exp.toDouble()).toInt() * b + expansion(a, b, exp - 1)
}
