package com.codingbat.warmup1

fun monkeyTrouble(aSmile: Boolean, bSmile: Boolean): Boolean {
  // if both monkeys are smiling, we are in trouble
  // if neither monkey is smiling, we are in trouble
  return (aSmile && bSmile) || !(aSmile || bSmile)
}
