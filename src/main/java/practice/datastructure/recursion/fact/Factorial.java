package practice.datastructure.recursion.fact;

public class Factorial {

  //With Recursion
  public static int getFactorial(int number) {
    if (number == 0 || number == 1) {
      return number;
    } else {
      return number * getFactorial(number - 1);
    }
  }

  //Without recursion using for loop
  public static int getFact(int number) {
    int fact = 1;
    if (number == 0 || number == 1) {
      return number;
    }
    for (int i = 1; i <= number; i++) {
      fact *= i;
    }
    return fact;

  }


}
