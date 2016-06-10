package com.codingbat.warmup1;

public class SleepIn {
  public static boolean sleepIn(boolean weekday, boolean vacation) {
    // sleep in if it's the weekend or on vacation
    return !weekday || vacation;
  }
}
