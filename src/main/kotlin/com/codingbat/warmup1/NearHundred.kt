package com.codingbat.warmup1

fun nearHundred(n: Int): Boolean {
  return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10
}
