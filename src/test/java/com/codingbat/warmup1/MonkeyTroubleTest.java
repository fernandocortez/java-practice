package com.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonkeyTroubleTest {
  @Test
  public void willBeInTroubleIfBothMonkeysAreSmiling() {
    assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
  }

  @Test
  public void willBeInTroubleIfNeitherMonkeyIsSmiling() {
    assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
  }

  @Test
  public void shouldNotBeInTroubleIfFirstMonkeyIsSmiling() {
    assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
  }

  @Test
  public void shouldNotBeInTroubleIfSecondMonkeyIsSmiling() {
    assertFalse(MonkeyTrouble.monkeyTrouble(false, true));
  }
}
