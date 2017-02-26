package com.codingbat.warmup1

import org.junit.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class MakesTenTestKt {
  @Test
  fun shouldBeOkWithNineAndTen() {
    assertTrue(makes10(9, 10))
  }

  @Test
  fun shouldNotBeOkWithNineAndNine() {
    assertFalse(makes10(9, 9))
  }

  @Test
  fun shouldBeOkWithOneAndNine() {
    assertTrue(makes10(1, 9))
  }

  @Test
  fun shouldBeOkWithTenAndOne() {
    assertTrue(makes10(10, 1))
  }

  @Test
  fun shouldBeOkWithTenAndTen() {
    assertTrue(makes10(10, 10))
  }

  @Test
  fun shouldBeOkWithEightAndTwo() {
    assertTrue(makes10(8, 2))
  }

  @Test
  fun shouldNotBeOkWithEightAndThree() {
    assertFalse(makes10(8, 3))
  }

  @Test
  fun shouldBeOkWithTenAndFortyTwo() {
    assertTrue(makes10(10, 42))
  }

  @Test
  fun shouldBeOkWithTwelveAndNegativeTwo() {
    assertTrue(makes10(12, -2))
  }
}
