package ninetynineproblems.lists;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class P01Test {

  @Test
  public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
    assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
  }
}
