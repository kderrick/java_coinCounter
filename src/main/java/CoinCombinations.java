import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class CoinCombinations {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      HashMap model = new HashMap();

    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      String userNumber = request.queryParams("numberInput");
      Integer intUserNumber = Integer.parseInt(userNumber);
      Integer[] userCoinArray = coinCounter(intUserNumber);
      Integer pennies = userCoinArray[0];
      Integer nickels = userCoinArray[1];
      Integer dimes = userCoinArray[2];
      Integer quarters = userCoinArray[3];

      model.put("pennies", pennies);
      model.put("nickels", nickels);
      model.put("dimes", dimes);
      model.put("quarters", quarters);

      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

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
