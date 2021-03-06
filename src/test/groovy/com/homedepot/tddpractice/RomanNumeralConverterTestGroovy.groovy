package com.homedepot.tddpractice

import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralConverterTestGroovy extends Specification {

  @Unroll
  def "integer to roman numeral conversion"(int n, String romanNumeral) {
    expect:
    romanNumeral == RomanNumeralConverter.INSTANCE.convertIntegerToRomanNumeral(n)

    where:
    n    || romanNumeral
    0    || ''
    1    || 'I'
    2    || 'II'
    3    || 'III'
    4    || 'IV'
    5    || 'V'
    6    || 'VI'
    7    || 'VII'
    8    || 'VIII'
    9    || 'IX'
    10   || 'X'
    11   || 'XI'
    12   || 'XII'
    13   || 'XIII'
    14   || 'XIV'
    15   || 'XV'
    16   || 'XVI'
    17   || 'XVII'
    18   || 'XVIII'
    19   || 'XIX'
    30   || 'XXX'
    42   || 'XLII'
    49   || 'XLIX'
    50   || 'L'
    56   || 'LVI'
    62   || 'LXII'
    79   || 'LXXIX'
    89   || 'LXXXIX'
    97   || 'XCVII'
    100  || 'C'
    140  || 'CXL'
    183  || 'CLXXXIII'
    190  || 'CXC'
    192  || 'CXCII'
    197  || 'CXCVII'
    200  || 'CC'
    240  || 'CCXL'
    283  || 'CCLXXXIII'
    290  || 'CCXC'
    292  || 'CCXCII'
    297  || 'CCXCVII'
    300  || 'CCC'
    340  || 'CCCXL'
    383  || 'CCCLXXXIII'
    390  || 'CCCXC'
    392  || 'CCCXCII'
    397  || 'CCCXCVII'
    400  || 'CD'
    440  || 'CDXL'
    483  || 'CDLXXXIII'
    490  || 'CDXC'
    492  || 'CDXCII'
    497  || 'CDXCVII'
    500  || 'D'
    540  || 'DXL'
    583  || 'DLXXXIII'
    590  || 'DXC'
    592  || 'DXCII'
    597  || 'DXCVII'
    600  || 'DC'
    640  || 'DCXL'
    683  || 'DCLXXXIII'
    690  || 'DCXC'
    692  || 'DCXCII'
    697  || 'DCXCVII'
    700  || 'DCC'
    740  || 'DCCXL'
    783  || 'DCCLXXXIII'
    790  || 'DCCXC'
    792  || 'DCCXCII'
    797  || 'DCCXCVII'
    800  || 'DCCC'
    840  || 'DCCCXL'
    883  || 'DCCCLXXXIII'
    890  || 'DCCCXC'
    892  || 'DCCCXCII'
    897  || 'DCCCXCVII'
    900  || 'CM'
    940  || 'CMXL'
    983  || 'CMLXXXIII'
    990  || 'CMXC'
    992  || 'CMXCII'
    997  || 'CMXCVII'
    1100 || 'MC'
    1140 || 'MCXL'
    1183 || 'MCLXXXIII'
    1190 || 'MCXC'
    1192 || 'MCXCII'
    1197 || 'MCXCVII'
    1200 || 'MCC'
    1240 || 'MCCXL'
    1283 || 'MCCLXXXIII'
    1290 || 'MCCXC'
    1292 || 'MCCXCII'
    1297 || 'MCCXCVII'
    1300 || 'MCCC'
    1340 || 'MCCCXL'
    1383 || 'MCCCLXXXIII'
    1390 || 'MCCCXC'
    1392 || 'MCCCXCII'
    1397 || 'MCCCXCVII'
    1400 || 'MCD'
    1440 || 'MCDXL'
    1483 || 'MCDLXXXIII'
    1490 || 'MCDXC'
    1492 || 'MCDXCII'
    1497 || 'MCDXCVII'
    1500 || 'MD'
    1540 || 'MDXL'
    1583 || 'MDLXXXIII'
    1590 || 'MDXC'
    1592 || 'MDXCII'
    1597 || 'MDXCVII'
    1600 || 'MDC'
    1640 || 'MDCXL'
    1683 || 'MDCLXXXIII'
    1690 || 'MDCXC'
    1692 || 'MDCXCII'
    1697 || 'MDCXCVII'
    1700 || 'MDCC'
    1740 || 'MDCCXL'
    1783 || 'MDCCLXXXIII'
    1790 || 'MDCCXC'
    1792 || 'MDCCXCII'
    1797 || 'MDCCXCVII'
    1800 || 'MDCCC'
    1840 || 'MDCCCXL'
    1883 || 'MDCCCLXXXIII'
    1890 || 'MDCCCXC'
    1892 || 'MDCCCXCII'
    1897 || 'MDCCCXCVII'
    1900 || 'MCM'
    1940 || 'MCMXL'
    1983 || 'MCMLXXXIII'
    1990 || 'MCMXC'
    1992 || 'MCMXCII'
    1997 || 'MCMXCVII'
    2100 || 'MMC'
    2140 || 'MMCXL'
    2183 || 'MMCLXXXIII'
    2190 || 'MMCXC'
    2192 || 'MMCXCII'
    2197 || 'MMCXCVII'
    2200 || 'MMCC'
    2240 || 'MMCCXL'
    2283 || 'MMCCLXXXIII'
    2290 || 'MMCCXC'
    2292 || 'MMCCXCII'
    2297 || 'MMCCXCVII'
    2300 || 'MMCCC'
    2340 || 'MMCCCXL'
    2383 || 'MMCCCLXXXIII'
    2390 || 'MMCCCXC'
    2392 || 'MMCCCXCII'
    2397 || 'MMCCCXCVII'
    2400 || 'MMCD'
    2440 || 'MMCDXL'
    2483 || 'MMCDLXXXIII'
    2490 || 'MMCDXC'
    2492 || 'MMCDXCII'
    2497 || 'MMCDXCVII'
    2500 || 'MMD'
    2540 || 'MMDXL'
    2583 || 'MMDLXXXIII'
    2590 || 'MMDXC'
    2592 || 'MMDXCII'
    2597 || 'MMDXCVII'
    2600 || 'MMDC'
    2640 || 'MMDCXL'
    2683 || 'MMDCLXXXIII'
    2690 || 'MMDCXC'
    2692 || 'MMDCXCII'
    2697 || 'MMDCXCVII'
    2700 || 'MMDCC'
    2740 || 'MMDCCXL'
    2783 || 'MMDCCLXXXIII'
    2790 || 'MMDCCXC'
    2792 || 'MMDCCXCII'
    2797 || 'MMDCCXCVII'
    2800 || 'MMDCCC'
    2840 || 'MMDCCCXL'
    2883 || 'MMDCCCLXXXIII'
    2890 || 'MMDCCCXC'
    2892 || 'MMDCCCXCII'
    2897 || 'MMDCCCXCVII'
    2900 || 'MMCM'
    2940 || 'MMCMXL'
    2983 || 'MMCMLXXXIII'
    2990 || 'MMCMXC'
    2992 || 'MMCMXCII'
    2997 || 'MMCMXCVII'
    3100 || 'MMMC'
    3140 || 'MMMCXL'
    3183 || 'MMMCLXXXIII'
    3190 || 'MMMCXC'
    3192 || 'MMMCXCII'
    3197 || 'MMMCXCVII'
    3200 || 'MMMCC'
    3240 || 'MMMCCXL'
    3283 || 'MMMCCLXXXIII'
    3290 || 'MMMCCXC'
    3292 || 'MMMCCXCII'
    3297 || 'MMMCCXCVII'
    3300 || 'MMMCCC'
    3340 || 'MMMCCCXL'
    3383 || 'MMMCCCLXXXIII'
    3390 || 'MMMCCCXC'
    3392 || 'MMMCCCXCII'
    3397 || 'MMMCCCXCVII'
    3400 || 'MMMCD'
    3440 || 'MMMCDXL'
    3483 || 'MMMCDLXXXIII'
    3490 || 'MMMCDXC'
    3492 || 'MMMCDXCII'
    3497 || 'MMMCDXCVII'
    3500 || 'MMMD'
    3540 || 'MMMDXL'
    3583 || 'MMMDLXXXIII'
    3590 || 'MMMDXC'
    3592 || 'MMMDXCII'
    3597 || 'MMMDXCVII'
    3600 || 'MMMDC'
    3640 || 'MMMDCXL'
    3683 || 'MMMDCLXXXIII'
    3690 || 'MMMDCXC'
    3692 || 'MMMDCXCII'
    3697 || 'MMMDCXCVII'
    3700 || 'MMMDCC'
    3740 || 'MMMDCCXL'
    3783 || 'MMMDCCLXXXIII'
    3790 || 'MMMDCCXC'
    3792 || 'MMMDCCXCII'
    3797 || 'MMMDCCXCVII'
    3800 || 'MMMDCCC'
    3840 || 'MMMDCCCXL'
    3883 || 'MMMDCCCLXXXIII'
    3890 || 'MMMDCCCXC'
    3892 || 'MMMDCCCXCII'
    3897 || 'MMMDCCCXCVII'
    3900 || 'MMMCM'
    3940 || 'MMMCMXL'
    3983 || 'MMMCMLXXXIII'
    3990 || 'MMMCMXC'
    3992 || 'MMMCMXCII'
    3997 || 'MMMCMXCVII'
    -1   || 'this number is not being handled'
  }
}
