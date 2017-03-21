package com.homedepot.tddpractice

class RomanNumeralConverter {
  fun convertIntegerToRomanNumeral(i: Int): String {
    return when (i) {
      0 -> ""
      in 1..3 -> "I" + convertIntegerToRomanNumeral(i - 1)
      4 -> "IV"
      in 5..8 -> "V" + convertIntegerToRomanNumeral(i - 5)
      9 -> "IX"
      in 10..39 -> "X" + convertIntegerToRomanNumeral(i - 10)
      in 40..49 -> "XL" + convertIntegerToRomanNumeral(i - 40)
      in 50..89 -> "L" + convertIntegerToRomanNumeral(i - 50)
      in 90..99 -> "XC" + convertIntegerToRomanNumeral(i - 90)
      in 100..189,
      in 200..399 -> "C" + convertIntegerToRomanNumeral(i - 100)
      in 190..199 -> "CX" + convertIntegerToRomanNumeral(i - 90)
      in 400..499 -> "CD" + convertIntegerToRomanNumeral(i - 400)
      in 500..899 -> "D" + convertIntegerToRomanNumeral(i - 500)
      in 900..999 -> "CM" + convertIntegerToRomanNumeral(i - 900)
      in 1000..3999 -> "M" + convertIntegerToRomanNumeral(i - 1000)
      else -> "this number is not being handled"
    }
  }
}
