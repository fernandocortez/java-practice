package com.codingbat.warmup1

fun parrotTrouble(talking: Boolean, hour: Int): Boolean {
  // in trouble if parrot is talking before 7 and after 20 hrs (24-hr clock)
  return talking && (hour < 7 || hour > 20)
}
