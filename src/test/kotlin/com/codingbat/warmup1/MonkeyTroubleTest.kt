package com.codingbat.warmup1

import org.junit.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class MonkeyTroubleTestKt {
  @Test
  fun willBeInTroubleIfBothMonkeysAreSmiling() {
    assertTrue(monkeyTrouble(true, true))
  }

  @Test
  fun willBeInTroubleIfNeitherMonkeyIsSmiling() {
    assertTrue(monkeyTrouble(false, false))
  }

  @Test
  fun shouldNotBeInTroubleIfFirstMonkeyIsSmiling() {
    assertFalse(monkeyTrouble(true, false))
  }

  @Test
  fun shouldNotBeInTroubleIfSecondMonkeyIsSmiling() {
    assertFalse(monkeyTrouble(false, true))
  }
}
