package com.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDoubleTest {
  @Test
  public void shouldEqualThreeForOneTwoSumDouble() {
    assertEquals(3, SumDouble.sumDouble(1, 2));
  }

  @Test
  public void shouldEqualFiveForThreeTwoSumDouble() {
    assertEquals(5, SumDouble.sumDouble(3, 2));
  }

  @Test
  public void shouldEqualEightForTwoTwoSumDouble() {
    assertEquals(8, SumDouble.sumDouble(2, 2));
  }

  @Test
  public void shouldEqualNegativeOneForNegativeOneZeroSumDouble() {
    assertEquals(-1, SumDouble.sumDouble(-1, 0));
  }

  @Test
  public void shouldEqualTwelveForThreeThreeSumDouble() {
    assertEquals(12, SumDouble.sumDouble(3, 3));
  }

  @Test
  public void shouldEqualZeroForZeroZeroSumDouble() {
    assertEquals(0, SumDouble.sumDouble(0, 0));
  }

  @Test
  public void shouldEqualOneForZeroOneSumDouble() {
    assertEquals(1, SumDouble.sumDouble(0, 1));
  }

  @Test
  public void shouldEqualSevenForThreeFourSumDouble() {
    assertEquals(7, SumDouble.sumDouble(3, 4));
  }
}
