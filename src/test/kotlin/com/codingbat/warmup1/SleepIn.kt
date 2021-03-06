package com.codingbat.warmup1

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SleepInTestKt {
  @Test
  fun shouldSleepInOnWeekendAndNotVacation() {
    assertTrue(sleepIn(false, false))
  }

  @Test
  fun shouldNotSleepInDuringWeekAndNotVacation() {
    assertFalse(sleepIn(true, false))
  }

  @Test
  fun shouldSleepInOnVacationOnWeekend() {
    assertTrue(sleepIn(false, true))
  }

  @Test
  fun shouldSleepInOnVacationDuringWeek() {
    assertTrue(sleepIn(true, true))
  }
}
