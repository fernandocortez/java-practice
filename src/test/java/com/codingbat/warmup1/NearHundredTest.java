package com.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NearHundredTest {
  @Test
  public void expect93ToBeNearHundred() {
    assertTrue(NearHundred.nearHundred(93));
  }

  @Test
  public void expect90ToBeNearHundred() {
    assertTrue(NearHundred.nearHundred(90));
  }

  @Test
  public void expect89ToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(89));
  }

  @Test
  public void expect110ToBeNearHundred() {
    assertTrue(NearHundred.nearHundred(110));
  }

  @Test
  public void expect111ToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(111));
  }

  @Test
  public void expect121ToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(121));
  }

  @Test
  public void expectZeroToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(0));
  }

  @Test
  public void expectFiveToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(5));
  }

  @Test
  public void expect191ToBeNearHundred() {
    assertTrue(NearHundred.nearHundred(191));
  }

  @Test
  public void expect189ToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(189));
  }

  @Test
  public void expect190ToBeNearHundred() {
    assertTrue(NearHundred.nearHundred(190));
  }

  @Test
  public void expect200ToBeNearHundred() {
    assertTrue(NearHundred.nearHundred(200));
  }

  @Test
  public void expect210ToBeNearHundred() {
    assertTrue(NearHundred.nearHundred(210));
  }

  @Test
  public void expect211ToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(211));
  }

  @Test
  public void expect290ToNotBeNearHundred() {
    assertFalse(NearHundred.nearHundred(290));
  }
}
