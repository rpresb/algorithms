import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EuclideanTest {

  @Test
  public void gcd() {
    Euclidean euclidean = new Euclidean();

    Assertions.assertThat(euclidean.gcd(2, 6)).isEqualTo(2);

    Assertions.assertThat(euclidean.gcd(30, 100)).isEqualTo(10);
  }

}