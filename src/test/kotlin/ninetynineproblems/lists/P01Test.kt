package ninetynineproblems.lists

import org.junit.Test
import kotlin.test.assertEquals

class P01TestKt {
  @Test
  fun shouldFindLastElementFromAListOfAlphabets() {
    assertEquals(last(listOf("a", "b", "c", "d")), "d")
  }
}
