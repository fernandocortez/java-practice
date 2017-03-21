package com.homedepot.tddpractice

class RomanNumeralConverter {
  fun convertRecursive(i: Int): String {
    return when (i) {
      0 -> ""
      in 1..3 -> "I" + convertRecursive(i - 1)
      4 -> "IV"
      in 5..8 -> "V" + convertRecursive(i - 5)
      9 -> "IX"
      in 10..39 -> "X" + convertRecursive(i - 10)
      in 40..49 -> "XL" + convertRecursive(i - 40)
      in 50..89 -> "L" + convertRecursive(i - 50)
      in 90..99 -> "XC" + convertRecursive(i - 90)
      else -> "this number is not being handled"
    }
  }
}
