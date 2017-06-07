package com.hackerrank.introduction.javaloops1

import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val n = sc.nextInt()
  for (i in 1..10) {
    System.out.printf("%d x %d = %d\n", n, i, n * i)
  }
}

