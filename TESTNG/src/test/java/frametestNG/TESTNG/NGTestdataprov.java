package frametestNG.TESTNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NGTestdataprov extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String pass) {
//	  NewTest ob = new NewTest(driver);
//	  ob.enteremail(email)
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
