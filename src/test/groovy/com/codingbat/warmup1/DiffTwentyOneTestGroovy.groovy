package com.codingbat.warmup1

import spock.lang.Specification

class DiffTwentyOneTestGroovy extends Specification {
  def "diff 21 with Java code"(int n, int expected) {
    expect:
    expected == DiffTwentyOne.diff21(n)

    where:
    n  | expected
    19 | 2
    10 | 11
    0  | 21
    22 | 2
    25 | 8
    30 | 18
    0  | 21
    1  | 20
    2  | 19
    -1 | 22
    -2 | 23
    50 | 58
  }

  def "diff 21 with Kotlin code"(int n, int expected) {
    expect:
    expected == DiffTwentyOneKt.diff21(n)

    where:
    n  | expected
    19 | 2
    10 | 11
    0  | 21
    22 | 2
    25 | 8
    30 | 18
    0  | 21
    1  | 20
    2  | 19
    -1 | 22
    -2 | 23
    50 | 58
  }
}
