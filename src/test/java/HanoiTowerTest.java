import org.junit.Test;

public class HanoiTowerTest {

  @Test
  public void solve() {
    HanoiTower hanoiTower = new HanoiTower();
    hanoiTower.solve(8, 'A', 'B', 'C');
  }

}