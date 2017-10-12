package ninetynineproblems.lists

import java.util.*

fun last(list: List<String>?): String {
  if (list == null || list.isEmpty()) {
    throw NoSuchElementException()
  }
  if (list.size == 1) {
    return list[0]
  }
  return last(list.subList(1, list.size))
}
