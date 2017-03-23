package com.homedepot.tddpractice

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class RomanNumeralConverterTest(val value: Int, val expected: String) {
  companion object {
    @JvmStatic
    @Parameters
    fun generateData(): Collection<Array<Any>> {
      return listOf(
        arrayOf(0, ""),
        arrayOf(1, "I"),
        arrayOf(2, "II"),
        arrayOf(3, "III"),
        arrayOf(4, "IV"),
        arrayOf(5, "V"),
        arrayOf(6, "VI"),
        arrayOf(7, "VII"),
        arrayOf(8, "VIII"),
        arrayOf(9, "IX"),
        arrayOf(10, "X"),
        arrayOf(11, "XI"),
        arrayOf(12, "XII"),
        arrayOf(13, "XIII"),
        arrayOf(14, "XIV"),
        arrayOf(15, "XV"),
        arrayOf(16, "XVI"),
        arrayOf(17, "XVII"),
        arrayOf(18, "XVIII"),
        arrayOf(19, "XIX"),
        arrayOf(30, "XXX"),
        arrayOf(42, "XLII"),
        arrayOf(49, "XLIX"),
        arrayOf(50, "L"),
        arrayOf(56, "LVI"),
        arrayOf(62, "LXII"),
        arrayOf(79, "LXXIX"),
        arrayOf(89, "LXXXIX"),
        arrayOf(97, "XCVII"),
        arrayOf(100, "C"),
        arrayOf(140, "CXL"),
        arrayOf(183, "CLXXXIII"),
        arrayOf(190, "CXC"),
        arrayOf(192, "CXCII"),
        arrayOf(197, "CXCVII"),
        arrayOf(200, "CC"),
        arrayOf(240, "CCXL"),
        arrayOf(283, "CCLXXXIII"),
        arrayOf(290, "CCXC"),
        arrayOf(292, "CCXCII"),
        arrayOf(297, "CCXCVII"),
        arrayOf(300, "CCC"),
        arrayOf(340, "CCCXL"),
        arrayOf(383, "CCCLXXXIII"),
        arrayOf(390, "CCCXC"),
        arrayOf(392, "CCCXCII"),
        arrayOf(397, "CCCXCVII"),
        arrayOf(400, "CD"),
        arrayOf(440, "CDXL"),
        arrayOf(483, "CDLXXXIII"),
        arrayOf(490, "CDXC"),
        arrayOf(492, "CDXCII"),
        arrayOf(497, "CDXCVII"),
        arrayOf(500, "D"),
        arrayOf(540, "DXL"),
        arrayOf(583, "DLXXXIII"),
        arrayOf(590, "DXC"),
        arrayOf(592, "DXCII"),
        arrayOf(597, "DXCVII"),
        arrayOf(600, "DC"),
        arrayOf(640, "DCXL"),
        arrayOf(683, "DCLXXXIII"),
        arrayOf(690, "DCXC"),
        arrayOf(692, "DCXCII"),
        arrayOf(697, "DCXCVII"),
        arrayOf(700, "DCC"),
        arrayOf(740, "DCCXL"),
        arrayOf(783, "DCCLXXXIII"),
        arrayOf(790, "DCCXC"),
        arrayOf(792, "DCCXCII"),
        arrayOf(797, "DCCXCVII"),
        arrayOf(800, "DCCC"),
        arrayOf(840, "DCCCXL"),
        arrayOf(883, "DCCCLXXXIII"),
        arrayOf(890, "DCCCXC"),
        arrayOf(892, "DCCCXCII"),
        arrayOf(897, "DCCCXCVII"),
        arrayOf(900, "CM"),
        arrayOf(940, "CMXL"),
        arrayOf(983, "CMLXXXIII"),
        arrayOf(990, "CMXC"),
        arrayOf(992, "CMXCII"),
        arrayOf(997, "CMXCVII"),
        // 1000
        arrayOf(1100, "MC"),
        arrayOf(1140, "MCXL"),
        arrayOf(1183, "MCLXXXIII"),
        arrayOf(1190, "MCXC"),
        arrayOf(1192, "MCXCII"),
        arrayOf(1197, "MCXCVII"),
        arrayOf(1200, "MCC"),
        arrayOf(1240, "MCCXL"),
        arrayOf(1283, "MCCLXXXIII"),
        arrayOf(1290, "MCCXC"),
        arrayOf(1292, "MCCXCII"),
        arrayOf(1297, "MCCXCVII"),
        arrayOf(1300, "MCCC"),
        arrayOf(1340, "MCCCXL"),
        arrayOf(1383, "MCCCLXXXIII"),
        arrayOf(1390, "MCCCXC"),
        arrayOf(1392, "MCCCXCII"),
        arrayOf(1397, "MCCCXCVII"),
        arrayOf(1400, "MCD"),
        arrayOf(1440, "MCDXL"),
        arrayOf(1483, "MCDLXXXIII"),
        arrayOf(1490, "MCDXC"),
        arrayOf(1492, "MCDXCII"),
        arrayOf(1497, "MCDXCVII"),
        arrayOf(1500, "MD"),
        arrayOf(1540, "MDXL"),
        arrayOf(1583, "MDLXXXIII"),
        arrayOf(1590, "MDXC"),
        arrayOf(1592, "MDXCII"),
        arrayOf(1597, "MDXCVII"),
        arrayOf(1600, "MDC"),
        arrayOf(1640, "MDCXL"),
        arrayOf(1683, "MDCLXXXIII"),
        arrayOf(1690, "MDCXC"),
        arrayOf(1692, "MDCXCII"),
        arrayOf(1697, "MDCXCVII"),
        arrayOf(1700, "MDCC"),
        arrayOf(1740, "MDCCXL"),
        arrayOf(1783, "MDCCLXXXIII"),
        arrayOf(1790, "MDCCXC"),
        arrayOf(1792, "MDCCXCII"),
        arrayOf(1797, "MDCCXCVII"),
        arrayOf(1800, "MDCCC"),
        arrayOf(1840, "MDCCCXL"),
        arrayOf(1883, "MDCCCLXXXIII"),
        arrayOf(1890, "MDCCCXC"),
        arrayOf(1892, "MDCCCXCII"),
        arrayOf(1897, "MDCCCXCVII"),
        arrayOf(1900, "MCM"),
        arrayOf(1940, "MCMXL"),
        arrayOf(1983, "MCMLXXXIII"),
        arrayOf(1990, "MCMXC"),
        arrayOf(1992, "MCMXCII"),
        arrayOf(1997, "MCMXCVII"),
        // 2000
        arrayOf(2100, "MMC"),
        arrayOf(2140, "MMCXL"),
        arrayOf(2183, "MMCLXXXIII"),
        arrayOf(2190, "MMCXC"),
        arrayOf(2192, "MMCXCII"),
        arrayOf(2197, "MMCXCVII"),
        arrayOf(2200, "MMCC"),
        arrayOf(2240, "MMCCXL"),
        arrayOf(2283, "MMCCLXXXIII"),
        arrayOf(2290, "MMCCXC"),
        arrayOf(2292, "MMCCXCII"),
        arrayOf(2297, "MMCCXCVII"),
        arrayOf(2300, "MMCCC"),
        arrayOf(2340, "MMCCCXL"),
        arrayOf(2383, "MMCCCLXXXIII"),
        arrayOf(2390, "MMCCCXC"),
        arrayOf(2392, "MMCCCXCII"),
        arrayOf(2397, "MMCCCXCVII"),
        arrayOf(2400, "MMCD"),
        arrayOf(2440, "MMCDXL"),
        arrayOf(2483, "MMCDLXXXIII"),
        arrayOf(2490, "MMCDXC"),
        arrayOf(2492, "MMCDXCII"),
        arrayOf(2497, "MMCDXCVII"),
        arrayOf(2500, "MMD"),
        arrayOf(2540, "MMDXL"),
        arrayOf(2583, "MMDLXXXIII"),
        arrayOf(2590, "MMDXC"),
        arrayOf(2592, "MMDXCII"),
        arrayOf(2597, "MMDXCVII"),
        arrayOf(2600, "MMDC"),
        arrayOf(2640, "MMDCXL"),
        arrayOf(2683, "MMDCLXXXIII"),
        arrayOf(2690, "MMDCXC"),
        arrayOf(2692, "MMDCXCII"),
        arrayOf(2697, "MMDCXCVII"),
        arrayOf(2700, "MMDCC"),
        arrayOf(2740, "MMDCCXL"),
        arrayOf(2783, "MMDCCLXXXIII"),
        arrayOf(2790, "MMDCCXC"),
        arrayOf(2792, "MMDCCXCII"),
        arrayOf(2797, "MMDCCXCVII"),
        arrayOf(2800, "MMDCCC"),
        arrayOf(2840, "MMDCCCXL"),
        arrayOf(2883, "MMDCCCLXXXIII"),
        arrayOf(2890, "MMDCCCXC"),
        arrayOf(2892, "MMDCCCXCII"),
        arrayOf(2897, "MMDCCCXCVII"),
        arrayOf(2900, "MMCM"),
        arrayOf(2940, "MMCMXL"),
        arrayOf(2983, "MMCMLXXXIII"),
        arrayOf(2990, "MMCMXC"),
        arrayOf(2992, "MMCMXCII"),
        arrayOf(2997, "MMCMXCVII"),
        // 3000
        arrayOf(3100, "MMMC"),
        arrayOf(3140, "MMMCXL"),
        arrayOf(3183, "MMMCLXXXIII"),
        arrayOf(3190, "MMMCXC"),
        arrayOf(3192, "MMMCXCII"),
        arrayOf(3197, "MMMCXCVII"),
        arrayOf(3200, "MMMCC"),
        arrayOf(3240, "MMMCCXL"),
        arrayOf(3283, "MMMCCLXXXIII"),
        arrayOf(3290, "MMMCCXC"),
        arrayOf(3292, "MMMCCXCII"),
        arrayOf(3297, "MMMCCXCVII"),
        arrayOf(3300, "MMMCCC"),
        arrayOf(3340, "MMMCCCXL"),
        arrayOf(3383, "MMMCCCLXXXIII"),
        arrayOf(3390, "MMMCCCXC"),
        arrayOf(3392, "MMMCCCXCII"),
        arrayOf(3397, "MMMCCCXCVII"),
        arrayOf(3400, "MMMCD"),
        arrayOf(3440, "MMMCDXL"),
        arrayOf(3483, "MMMCDLXXXIII"),
        arrayOf(3490, "MMMCDXC"),
        arrayOf(3492, "MMMCDXCII"),
        arrayOf(3497, "MMMCDXCVII"),
        arrayOf(3500, "MMMD"),
        arrayOf(3540, "MMMDXL"),
        arrayOf(3583, "MMMDLXXXIII"),
        arrayOf(3590, "MMMDXC"),
        arrayOf(3592, "MMMDXCII"),
        arrayOf(3597, "MMMDXCVII"),
        arrayOf(3600, "MMMDC"),
        arrayOf(3640, "MMMDCXL"),
        arrayOf(3683, "MMMDCLXXXIII"),
        arrayOf(3690, "MMMDCXC"),
        arrayOf(3692, "MMMDCXCII"),
        arrayOf(3697, "MMMDCXCVII"),
        arrayOf(3700, "MMMDCC"),
        arrayOf(3740, "MMMDCCXL"),
        arrayOf(3783, "MMMDCCLXXXIII"),
        arrayOf(3790, "MMMDCCXC"),
        arrayOf(3792, "MMMDCCXCII"),
        arrayOf(3797, "MMMDCCXCVII"),
        arrayOf(3800, "MMMDCCC"),
        arrayOf(3840, "MMMDCCCXL"),
        arrayOf(3883, "MMMDCCCLXXXIII"),
        arrayOf(3890, "MMMDCCCXC"),
        arrayOf(3892, "MMMDCCCXCII"),
        arrayOf(3897, "MMMDCCCXCVII"),
        arrayOf(3900, "MMMCM"),
        arrayOf(3940, "MMMCMXL"),
        arrayOf(3983, "MMMCMLXXXIII"),
        arrayOf(3990, "MMMCMXC"),
        arrayOf(3992, "MMMCMXCII"),
        arrayOf(3997, "MMMCMXCVII"),
        arrayOf(-1, "this number is not being handled")
      )
    }
  }

  @Test
  fun shouldReturnExpectedRomanFromInteger() {
    val actual: String = RomanNumeralConverter.convertIntegerToRomanNumeral(value)
    assertEquals(expected, actual)
  }
}
