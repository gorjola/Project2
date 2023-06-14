package Step;
import Page.SwoopLocators;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertStep {
    SwoopLocators swoop = new SwoopLocators();
    SoftAssert asert = new SoftAssert();

    @Step
    public void firstMethodAssert() {

        for (SelenideElement x : swoop.hotelList) {
            int price = Integer.parseInt(x.getText().replaceAll("[^0-9]", ""));
            if (price > 200 && price < 230) {
                System.out.println("done");
            } else {
                asert.fail();
                System.out.println("bad filter");

                //break;
            }

        }
        asert.assertAll();
    }
    @Step
    public void secondMethodAssert(){
        swoop.login.shouldBe(Condition.visible);
        swoop.login.isDisplayed();
    }
    @Step
    public void secondMethodAssert2(){
        double width=Double.parseDouble(swoop.vaucherDiagramList.get(0).getAttribute("data-width").replaceAll("[^0-9.]",""));
        Assert.assertTrue(width<100);
        System.out.println(swoop.sellCountList.get(0).getText());
    }
    @Step
    public void thirdMethodAssert(){
        double firstPriceValue = Double.parseDouble(swoop.sushipriceList.get(0).getText().replaceAll("[^0-9.]", ""));
        double secondPriceValue = Double.parseDouble(swoop.sushipriceList.get(1).getText().replaceAll("[^0-9.]", ""));
        Assert.assertTrue(firstPriceValue>secondPriceValue);

    }
    @Step
    public void fourMethodAssert(){
        swoop.facebook.shouldBe(Condition.visible);
        swoop.facebook.isDisplayed();
    }
    @Step
    public void fiveMethodAssert(){
        swoop.SqesisErrorMess.shouldBe(Condition.visible);
        swoop.SqesisErrorMess.isDisplayed();
    }
}
