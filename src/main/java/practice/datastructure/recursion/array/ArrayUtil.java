package practice.datastructure.recursion.array;

public class ArrayUtil {

  public static boolean isArraySorted(int[] array, int n) {
    if (n == 1) {
      return true;
    } else {
      return array[n - 2] > array[n - 1] ? false : isArraySorted(array, n - 1);
    }
  }


}
