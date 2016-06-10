package com.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MakesTenTest {
  @Test
  public void shouldBeOkWithNineAndTen() {
    assertTrue(MakesTen.makes10(9, 10));
  }

  @Test
  public void shouldNotBeOkWithNineAndNine() {
    assertFalse(MakesTen.makes10(9, 9));
  }

  @Test
  public void shouldBeOkWithOneAndNine() {
    assertTrue(MakesTen.makes10(1, 9));
  }

  @Test
  public void shouldBeOkWithTenAndOne() {
    assertTrue(MakesTen.makes10(10, 1));
  }

  @Test
  public void shouldBeOkWithTenAndTen() {
    assertTrue(MakesTen.makes10(10, 10));
  }

  @Test
  public void shouldBeOkWithEightAndTwo() {
    assertTrue(MakesTen.makes10(8, 2));
  }

  @Test
  public void shouldNotBeOkWithEightAndThree() {
    assertFalse(MakesTen.makes10(8, 3));
  }

  @Test
  public void shouldBeOkWithTenAndFortyTwo() {
    assertTrue(MakesTen.makes10(10, 42));
  }

  @Test
  public void shouldBeOkWithTwelveAndNegativeTwo() {
    assertTrue(MakesTen.makes10(12, -2));
  }
}
