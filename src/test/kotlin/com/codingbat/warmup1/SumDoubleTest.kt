package com.codingbat.warmup1

import org.junit.Test
import kotlin.test.assertEquals

class SumDoubleTestKt {
  @Test
  fun shouldEqualThreeForOneTwoSumDouble() {
    assertEquals(3, sumDouble(1, 2).toLong())
  }

  @Test
  fun shouldEqualFiveForThreeTwoSumDouble() {
    assertEquals(5, sumDouble(3, 2).toLong())
  }

  @Test
  fun shouldEqualEightForTwoTwoSumDouble() {
    assertEquals(8, sumDouble(2, 2).toLong())
  }

  @Test
  fun shouldEqualNegativeOneForNegativeOneZeroSumDouble() {
    assertEquals(-1, sumDouble(-1, 0).toLong())
  }

  @Test
  fun shouldEqualTwelveForThreeThreeSumDouble() {
    assertEquals(12, sumDouble(3, 3).toLong())
  }

  @Test
  fun shouldEqualZeroForZeroZeroSumDouble() {
    assertEquals(0, sumDouble(0, 0).toLong())
  }

  @Test
  fun shouldEqualOneForZeroOneSumDouble() {
    assertEquals(1, sumDouble(0, 1).toLong())
  }

  @Test
  fun shouldEqualSevenForThreeFourSumDouble() {
    assertEquals(7, sumDouble(3, 4).toLong())
  }
}
