package com.codingbat.warmup1;

public class MonkeyTrouble {

  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // if both monkeys are smiling, we are in trouble
    // if neither monkey is smiling, we are in trouble
    return (aSmile && bSmile) || !(aSmile || bSmile);
  }
}
