import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FactorialTest {

  @Test
  public void solve() {
    Factorial factorial = new Factorial();
    Assertions.assertThat(factorial.solve(5)).isEqualTo(120);
  }
}
