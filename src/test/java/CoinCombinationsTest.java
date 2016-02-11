import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CoinCombinationsTest {
  @Test
  public void coinCounter_CountNumberOfPennys_4() {
    CoinCombinations testCoinCombinations = new CoinCombinations();
    Integer[] coinArray = {4, 0, 0, 0};
    assertEquals(coinArray, testCoinCombinations.coinCounter(4));
  }
  @Test
  public void coinCounter_CountNumberOfNickels_1() {
    CoinCombinations testCoinCombinations = new CoinCombinations();
    Integer[] coinArray = {1, 1, 0, 0};
    assertEquals(coinArray, testCoinCombinations.coinCounter(6));
  }
  @Test
  public void coinCounter_CountNumberOfDimes_1() {
    CoinCombinations testCoinCombinations = new CoinCombinations();
    Integer[] coinArray = {1, 1, 1, 0};
    assertEquals(coinArray, testCoinCombinations.coinCounter(16));
  }
  @Test
  public void coinCounter_CountNumberOfQuarters_1() {
    CoinCombinations testCoinCombinations = new CoinCombinations();
    Integer[] coinArray = {4, 1, 1, 1};
    assertEquals(coinArray, testCoinCombinations.coinCounter(44));
  }
}
