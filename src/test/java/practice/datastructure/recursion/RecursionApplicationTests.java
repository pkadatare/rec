package practice.datastructure.recursion;

import static org.junit.Assert.assertEquals;
import static practice.datastructure.recursion.array.ArrayUtil.isArraySorted;
import static practice.datastructure.recursion.fact.Factorial.getFact;
import static practice.datastructure.recursion.fact.Factorial.getFactorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecursionApplicationTests {

  @Test
  public void contextLoads() {
  }

  @Test
  public void testFactorialWithRecurison() {
    assertEquals(0, getFactorial(0));
    assertEquals(1, getFactorial(1));
    assertEquals(2, getFactorial(2));
    assertEquals(6, getFactorial(3));
    assertEquals(120, getFactorial(5));

  }

  @Test
  public void testFactorialWithoutRecursion() {
    assertEquals(0, getFact(0));
    assertEquals(1, getFact(1));
    assertEquals(2, getFact(2));
    assertEquals(6, getFact(3));
    assertEquals(120, getFact(5));

  }

  @Test
  public void testIdArraySortedForSignleElement() {
    int[] array = {0};
    assertEquals(true, isArraySorted(array, 1));
  }

  @Test
  public void testIdArraySortedForMoreThanOneElement() {
    int[] array = {0, 1, 3, 5, 9};
    assertEquals(true, isArraySorted(array, 5));
    int[] unsortedArray = {1, 0};
    assertEquals(false, isArraySorted(unsortedArray, 2));
  }


}
