package com.codingbat.warmup1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SleepInTest {

  @Test
  public void shouldSleepInOnWeekendAndNotVacation() {
    assertTrue(SleepIn.sleepIn(false, false));
  }

  @Test
  public void shouldNotSleepInDuringWeekAndNotVacation() {
    assertFalse(SleepIn.sleepIn(true, false));
  }

  @Test
  public void shouldSleepInOnVacationOnWeekend() {
    assertTrue(SleepIn.sleepIn(false, true));
  }

  @Test
  public void shouldSleepInOnVacationDuringWeek() {
    assertTrue(SleepIn.sleepIn(true, true));
  }
}
