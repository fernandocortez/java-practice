package com.codingbat.warmup1

import org.junit.Test
import kotlin.test.assertEquals

class DiffTwentyOneTestKt {
  @Test
  fun shouldEqualTwoWhenDiffingNineteen() {
    assertEquals(2, diff21(19))
  }

  @Test
  fun shouldEqualElevenWhenDiffingTen() {
    assertEquals(11, diff21(10))
  }

  @Test
  fun shouldEqualZeroWhenDiffingTwentyOne() {
    assertEquals(0, diff21(21))
  }

  @Test
  fun shouldEqualTwoWhenDiffingTwentyTwo() {
    assertEquals(2, diff21(22))
  }

  @Test
  fun shouldEqualEightWhenDiffingTwentyFive() {
    assertEquals(8, diff21(25))
  }

  @Test
  fun shouldEqualEighteenWhenDiffingThirty() {
    assertEquals(18, diff21(30))
  }

  @Test
  fun shouldEqualTwentyOneWhenDiffingZero() {
    assertEquals(21, diff21(0))
  }

  @Test
  fun shouldEqualTwentyWhenDiffingOne() {
    assertEquals(20, diff21(1))
  }

  @Test
  fun shouldEqualNineteenWhenDiffingTwo() {
    assertEquals(19, diff21(2))
  }

  @Test
  fun shouldEqualTwentyTwoWhenDiffingNegativeOne() {
    assertEquals(22, diff21(-1))
  }

  @Test
  fun shouldEqualTwentyThreeWhenDiffingNegativeTwo() {
    assertEquals(23, diff21(-2))
  }

  @Test
  fun shouldEqualFiftyEightWhenDiffingFifty() {
    assertEquals(58, diff21(50))
  }
}
