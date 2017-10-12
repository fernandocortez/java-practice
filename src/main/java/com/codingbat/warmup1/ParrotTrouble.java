package com.codingbat.warmup1;

public class ParrotTrouble {

  public static boolean parrotTrouble(boolean talking, int hour) {
    // in trouble if parrot is talking before 7 and after 20 hrs (24-hr clock)
    return talking && (hour < 7 || hour > 20);
  }
}
