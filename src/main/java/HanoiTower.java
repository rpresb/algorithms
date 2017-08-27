public class HanoiTower {

  public void solve(int n, char rodFrom, char middlerRod, char rodTo) {
    if (n == 1) {
      System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
      return;
    }

    solve(n-1, rodFrom, rodTo, middlerRod);

    System.out.println("Plane " + n + " from " + rodFrom + " to " + rodTo);

    solve(n-1, middlerRod, rodFrom, rodTo);
  }
}
