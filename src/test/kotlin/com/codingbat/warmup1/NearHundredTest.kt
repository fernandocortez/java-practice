package com.codingbat.warmup1

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NearHundredTestKt {
  @Test
  fun expect93ToBeNearHundred() {
    assertTrue(nearHundred(93))
  }

  @Test
  fun expect90ToBeNearHundred() {
    assertTrue(nearHundred(90))
  }

  @Test
  fun expect89ToNotBeNearHundred() {
    assertFalse(nearHundred(89))
  }

  @Test
  fun expect110ToBeNearHundred() {
    assertTrue(nearHundred(110))
  }

  @Test
  fun expect111ToNotBeNearHundred() {
    assertFalse(nearHundred(111))
  }

  @Test
  fun expect121ToNotBeNearHundred() {
    assertFalse(nearHundred(121))
  }

  @Test
  fun expectZeroToNotBeNearHundred() {
    assertFalse(nearHundred(0))
  }

  @Test
  fun expectFiveToNotBeNearHundred() {
    assertFalse(nearHundred(5))
  }

  @Test
  fun expect191ToBeNearHundred() {
    assertTrue(nearHundred(191))
  }

  @Test
  fun expect189ToNotBeNearHundred() {
    assertFalse(nearHundred(189))
  }

  @Test
  fun expect190ToBeNearHundred() {
    assertTrue(nearHundred(190))
  }

  @Test
  fun expect200ToBeNearHundred() {
    assertTrue(nearHundred(200))
  }

  @Test
  fun expect210ToBeNearHundred() {
    assertTrue(nearHundred(210))
  }

  @Test
  fun expect211ToNotBeNearHundred() {
    assertFalse(nearHundred(211))
  }

  @Test
  fun expect290ToNotBeNearHundred() {
    assertFalse(nearHundred(290))
  }
}
