package com.codingbat.warmup1;

public class DiffTwentyOne {

  public static int diff21(int n) {
    if (n > 21) {
      return 2 * (n - 21);
    }
    return 21 - n;
  }
}
