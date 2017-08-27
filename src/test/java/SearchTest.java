import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SearchTest {

  private Search search;

  @Before
  public void setup() {
    search = new Search(new int[] {1, 2, 3, 4, 5, 6, 7, 100, 233});
  }

  @Test
  public void linear() {
    Assertions.assertThat(search.linear(1)).isEqualTo(0);
    Assertions.assertThat(search.linear(4)).isEqualTo(3);
    Assertions.assertThat(search.linear(233)).isEqualTo(8);
    Assertions.assertThat(search.linear(400)).isEqualTo(-1);
  }

  @Test
  public void binary() {
    Assertions.assertThat(search.binary(1)).isEqualTo(0);
    Assertions.assertThat(search.linear(4)).isEqualTo(3);
    Assertions.assertThat(search.linear(233)).isEqualTo(8);
    Assertions.assertThat(search.linear(400)).isEqualTo(-1);
  }
}
