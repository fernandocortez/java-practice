package com.codingbat.warmup1

import org.junit.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class ParrotTroubleTestKt {
  @Test
  fun inTroubleIfParrotTalkingAtSixHours() {
    assertTrue(parrotTrouble(true, 6))
  }

  @Test
  fun notInTroubleIfParrotTalkingAtSevenHours() {
    assertFalse(parrotTrouble(true, 7))
  }

  @Test
  fun notInTroubleIfParrotNotTalkingAtSixHours() {
    assertFalse(parrotTrouble(false, 6))
  }

  @Test
  fun inTroubleIfParrotTalkingAtTwentyOneHours() {
    assertTrue(parrotTrouble(true, 21))
  }

  @Test
  fun notInTroubleIfParrotNotTalkingAtTwentyOneHours() {
    assertFalse(parrotTrouble(false, 21))
  }

  @Test
  fun notInTroubleIfParrotNotTalkingAtTwentyHourse() {
    assertFalse(parrotTrouble(false, 20))
  }

  @Test
  fun inTroubleIfParrotTalkingAtTwentyThreeHours() {
    assertTrue(parrotTrouble(true, 23))
  }

  @Test
  fun notInTroubleIfParrotTalkingAtTwentyThreeHours() {
    assertFalse(parrotTrouble(false, 23))
  }

  @Test
  fun notInTroubleIfParrotTalkingAtTwentyHours() {
    assertFalse(parrotTrouble(true, 20))
  }

  @Test
  fun notInTroubleIfParrotNotTalkingAtTwelveHours() {
    assertFalse(parrotTrouble(false, 12))
  }
}
