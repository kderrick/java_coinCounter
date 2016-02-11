import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class CoinCombinations {
  public static void main(String[] args) {}

public static Integer[] coinCounter(Integer userNumber) {
  Integer[] coinArray = {0, 0, 0, 0};
  Integer remainder = 0;
  if(userNumber < 0) {
    userNumber = Math.abs(userNumber);
  }
  while(userNumber != 0) {
    if(userNumber >= 25) {
      coinArray[3] = userNumber / 25;
      userNumber = userNumber % 25;
    } else if (userNumber >= 10) {
      coinArray[2] = userNumber / 10;
      userNumber = userNumber % 10;
    } else if(userNumber >= 5) {
      coinArray[1] = userNumber / 5;
      userNumber = userNumber % 5;
    } else {
      coinArray[0] = userNumber;
      userNumber = 0;
    }
  }
  return coinArray;
  }
}
