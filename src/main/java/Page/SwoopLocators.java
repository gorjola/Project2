package Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SwoopLocators {

      public ElementsCollection categoryList=$$x("//li[@class='MoreCategories']");
      public SelenideElement minPrice=$x("//div[@class='clearfix']//child::input[@name='minprice']");
      public SelenideElement maxPrice=$x("//div[@class='clearfix']//child::input[@name='maxprice']");
      public SelenideElement clickSearch=$x("//div[@class='clearfix']//child::div[@class='submit-button']");
      public ElementsCollection  hotelList=$$x("//div[@class='discounted-prices']//child::p[@class='deal-voucher-price'][1]");

      public SelenideElement category=$x("//p[@class='categoriesTitle']");
      public ElementsCollection CategoryList=$$x("//a[@class='mainCategories']");

      public SelenideElement sushi=$(By.linkText("სუში"));
      public ElementsCollection favoriteButtList=$$x("//div[@class='deal-box-wishlist']");

      public SelenideElement login=$x("//div[@class='main-page-login']");
      public ElementsCollection vaucherDiagramList=$$x("//div[@class='voucher-limit']");
      public ElementsCollection sellCountList=$$x("//div[@class='discounted-prices']//following-sibling::p[contains(text(),'გაყიდულია')]");

      public SelenideElement sort=$(By.id("sort"));
      public SelenideElement sortpick=$x("//option[contains(text(),'ფასით კლებადი')]");
      public ElementsCollection sushipriceList=$$x("//div[@class='discounted-prices']//child::p[1]");
      public  ElementsCollection sushiList = $$x("//img[@class='special-offer-img']");
      public SelenideElement sharebutt = $x("//span[contains(text(),'გაზიარება')]");

      public SelenideElement facebook=$(By.id("facebook"));

      //5 methodi
      public SelenideElement shesvla=$x("//div[@class='HeaderTools swoop-login']");
      public  SelenideElement registracia=$x("//a[@id='ui-id-3']");
      public  SelenideElement saxeli=$x("//input[@id='pFirstName']");
      public  SelenideElement gvari=$x("//input[@id='pLastName']");
      public  SelenideElement elposta=$x("//input[@id='pEmail']");

      public  SelenideElement mobiluri=$x("//input[@id='pPhone']");
      public  SelenideElement tarigi=$x("//input[@id='pDateBirth']");
      public  SelenideElement paroli=$x("//input[@id='pPassword']");
      public  SelenideElement gaimeoretParoli=$x("//input[@id='pConfirmPassword']");
      public  SelenideElement vetanxmebi1=$x("//input[@id='pIsAgreeTerns']");
      public  SelenideElement vetanxmebi2=$x("//input[@id='pIsSubscribedNewsletter']");
      public  SelenideElement registracionButt=$x("//div[@class='dashbord-registration']");
      public  SelenideElement SqesisErrorMess=$x("//p[@id='physicalInfoMassage']");

}
