public class Factorial {

  private int factorial(int accumulator, int n) {

    if (n == 1) return accumulator;
    return factorial(accumulator * n, n - 1);
  }

  public int solve(int n) {
    return factorial(1, n);
  }
}
