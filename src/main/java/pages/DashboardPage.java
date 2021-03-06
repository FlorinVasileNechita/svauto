package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static helpers.WebElementHelper.areVisible;

public class DashboardPage extends BasePage {

  public final static String URL="http://automationpractice.com";

  @FindBy(id = "homeslider")
  private WebElement carousel;

  @Override
  protected boolean isCurrent() {
    return areVisible(carousel);
  }

  @Override
  protected boolean isValid() {
    return areVisible(carousel);
  }

  public DashboardPage(WebDriver driver){
    super(driver);
  }

  public void clickLoginButton(){
      headerLoginButton.click();
    }

  public void open(){
    openUrl(URL);
  }
}
