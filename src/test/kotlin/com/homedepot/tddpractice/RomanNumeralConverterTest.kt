package com.homedepot.tddpractice

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class RomanNumeralConverterTest(val value: Int, val expected: String) {
  private val rnc = RomanNumeralConverter()

  companion object {
    @JvmStatic
    @Parameters
    fun generateData(): Collection<Array<Any>> {
      return listOf(
        arrayOf(0, ""),
        arrayOf(1, "I"),
        arrayOf(2, "II"),
        arrayOf(3, "III"),
        arrayOf(4, "IV"),
        arrayOf(5, "V"),
        arrayOf(6, "VI"),
        arrayOf(7, "VII"),
        arrayOf(8, "VIII"),
        arrayOf(9, "IX"),
        arrayOf(10, "X"),
        arrayOf(11, "XI"),
        arrayOf(12, "XII"),
        arrayOf(13, "XIII"),
        arrayOf(14, "XIV"),
        arrayOf(15, "XV"),
        arrayOf(16, "XVI"),
        arrayOf(17, "XVII"),
        arrayOf(18, "XVIII"),
        arrayOf(19, "XIX"),
        arrayOf(30, "XXX"),
        arrayOf(42, "XLII"),
        arrayOf(49, "XLIX"),
        arrayOf(50, "L"),
        arrayOf(56, "LVI"),
        arrayOf(62, "LXII"),
        arrayOf(79, "LXXIX"),
        arrayOf(89, "LXXXIX"),
        arrayOf(97, "XCVII"),
        arrayOf(100, "this number is not being handled"),
        arrayOf(-1, "this number is not being handled")
      )
    }
  }

  @Test
  fun shouldReturnExpectedRomanFromInteger() {
    val actual: String = rnc.convertIntegerToRomanNumeral(value)
    assertEquals(expected, actual)
  }
}
