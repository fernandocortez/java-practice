package com.codingbat.warmup1

fun diff21(n: Int): Int {
  if (n > 21) {
    return 2 * (n - 21)
  } else {
    return 21 - n
  }
}
