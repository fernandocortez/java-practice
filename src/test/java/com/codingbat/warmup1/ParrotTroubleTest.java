package com.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParrotTroubleTest {
  @Test
  public void inTroubleIfParrotTalkingAtSixHours() {
    assertTrue(ParrotTrouble.parrotTrouble(true, 6));
  }

  @Test
  public void notInTroubleIfParrotTalkingAtSevenHours() {
    assertFalse(ParrotTrouble.parrotTrouble(true, 7));
  }

  @Test
  public void notInTroubleIfParrotNotTalkingAtSixHours() {
    assertFalse(ParrotTrouble.parrotTrouble(false, 6));
  }

  @Test
  public void inTroubleIfParrotTalkingAtTwentyOneHours() {
    assertTrue(ParrotTrouble.parrotTrouble(true, 21));
  }

  @Test
  public void notInTroubleIfParrotNotTalkingAtTwentyOneHours() {
    assertFalse(ParrotTrouble.parrotTrouble(false, 21));
  }

  @Test
  public void notInTroubleIfParrotNotTalkingAtTwentyHourse() {
    assertFalse(ParrotTrouble.parrotTrouble(false, 20));
  }

  @Test
  public void inTroubleIfParrotTalkingAtTwentyThreeHours() {
    assertTrue(ParrotTrouble.parrotTrouble(true, 23));
  }

  @Test
  public void notInTroubleIfParrotTalkingAtTwentyThreeHours() {
    assertFalse(ParrotTrouble.parrotTrouble(false, 23));
  }

  @Test
  public void notInTroubleIfParrotTalkingAtTwentyHours() {
    assertFalse(ParrotTrouble.parrotTrouble(true, 20));
  }

  @Test
  public void notInTroubleIfParrotNotTalkingAtTwelveHours() {
    assertFalse(ParrotTrouble.parrotTrouble(false, 12));
  }
}
