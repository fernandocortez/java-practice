package com.codingbat.warmup1

fun sleepIn(weekday: Boolean, vacation: Boolean): Boolean {
  // sleep in if it's the weekend or on vacation
  return !weekday || vacation
}
