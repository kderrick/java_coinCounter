import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CoinCombinationsTest {
  @Test
  public void coinCounter_CountNumberOfPennys_4() {
    CoinCombinations testCoinCombinations = new CoinCombinations();
    assertEquals(4, testCoinCombinations.coinCounter(4));
  }

}
