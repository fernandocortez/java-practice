package com.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiffTwentyOneTest {
  @Test
  public void shouldEqualTwoWhenDiffingNineteen() {
    assertEquals(2, DiffTwentyOne.diff21(19));
  }

  @Test
  public void shouldEqualElevenWhenDiffingTen() {
    assertEquals(11, DiffTwentyOne.diff21(10));
  }

  @Test
  public void shouldEqualZeroWhenDiffingTwentyOne() {
    assertEquals(0, DiffTwentyOne.diff21(21));
  }

  @Test
  public void shouldEqualTwoWhenDiffingTwentyTwo() {
    assertEquals(2, DiffTwentyOne.diff21(22));
  }

  @Test
  public void shouldEqualEightWhenDiffingTwentyFive() {
    assertEquals(8, DiffTwentyOne.diff21(25));
  }

  @Test
  public void shouldEqualEighteenWhenDiffingThirty() {
    assertEquals(18, DiffTwentyOne.diff21(30));
  }

  @Test
  public void shouldEqualTwentyOneWhenDiffingZero() {
    assertEquals(21, DiffTwentyOne.diff21(0));
  }

  @Test
  public void shouldEqualTwentyWhenDiffingOne() {
    assertEquals(20, DiffTwentyOne.diff21(1));
  }

  @Test
  public void shouldEqualNineteenWhenDiffingTwo() {
    assertEquals(19, DiffTwentyOne.diff21(2));
  }

  @Test
  public void shouldEqualTwentyTwoWhenDiffingNegativeOne() {
    assertEquals(22, DiffTwentyOne.diff21(-1));
  }

  @Test
  public void shouldEqualTwentyThreeWhenDiffingNegativeTwo() {
    assertEquals(23, DiffTwentyOne.diff21(-2));
  }

  @Test
  public void shouldEqualFiftyEightWhenDiffingFifty() {
    assertEquals(58, DiffTwentyOne.diff21(50));
  }
}
