package com.homedepot.tddpractice

import org.junit.Test
import kotlin.test.assertEquals

class RomanNumeralConverterTest {
  val rnc = RomanNumeralConverter()

  @Test
  fun testIf1ReturnAnI() {
    val expected = "I"
    val actual: String = rnc.convertRecursive(1)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf2ReturnsII() {
    val expected = "II"
    val actual: String = rnc.convertRecursive(2)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf3ReturnsIII() {
    val expected = "III"
    val actual: String = rnc.convertRecursive(3)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf4ReturnsIV() {
    val expected = "IV"
    val actual: String = rnc.convertRecursive(4)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf5ReturnsV() {
    val expected = "V"
    val actual: String = rnc.convertRecursive(5)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf6ReturnsVI() {
    val expected = "VI"
    val actual: String = rnc.convertRecursive(6)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf13ReturnsXIII() {
    val expected = "XIII"
    val actual: String = rnc.convertRecursive(13)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf16ReturnsXVI() {
    val expected = "XVI"
    val actual: String = rnc.convertRecursive(16)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf35ReturnsXXXV() {
    val expected = "XXXV"
    val actual: String = rnc.convertRecursive(35)
    assertEquals(expected, actual)
  }

  @Test
  fun testIf49ReturnsXLIX() {
    val expected = "XLIX"
    val actual: String = rnc.convertRecursive(49)
    assertEquals(expected, actual)
  }
}
