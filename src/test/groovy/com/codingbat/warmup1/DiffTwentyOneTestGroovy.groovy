package com.codingbat.warmup1

import spock.lang.Specification

class DiffTwentyOneTestGroovy extends Specification {
  def "should equal 2 when diffing with 19"() {
    given: "input is 19"
    def input = 19

    when: "result is computed"
    def result = DiffTwentyOne.diff21(input)

    then: "there should be a difference of 2"
    result == 2
  }

  def "should equal 2 when diffing with 19 using Kotlin port"() {
    given: "input is 19"
    def input = 19

    when: "result is computed"
    def result = DiffTwentyOneKt.diff21(input)

    then: "there should be a difference of 2"
    result == 2
  }

  def "should equal 11 when diffing with 10"() {
    given: "input is 10"
    def input = 10

    when: "result is computed"
    def result = DiffTwentyOne.diff21(input)

    then: "there should be a difference of 11"
    result == 11
  }

  def "should equal 11 when diffing with 10 using Kotlin port"() {
    given: "input is 10"
    def input = 10

    when: "result is computed"
    def result = DiffTwentyOneKt.diff21(input)

    then: "there should be a difference of 11"
    result == 11
  }

  def "should equal 0 when diffing with 21"() {
    given: "input is 0"
    def input = 0

    when: "result is computed"
    def result = DiffTwentyOne.diff21(input)

    then: "there should be a difference of 11"
    result == 21
  }

  def "should equal 0 when diffing with 21 using Kotlin port"() {
    given: "input is 0"
    def input = 0

    when: "result is computed"
    def result = DiffTwentyOneKt.diff21(input)

    then: "there should be a difference of 11"
    result == 21
  }
}
