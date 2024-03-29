package Step;

import Page.SwoopLocators;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.actions;

public class fourMethodStep {
    SwoopLocators swoop=new SwoopLocators();
    @Step("კატეგორიაზე დაკლიკება")
    public fourMethodStep firstStep(){
        swoop.category.click();
        return this;
    }
    @Step("კვებასთან მაუსის მიტანა")
    public fourMethodStep secondStep(){
        for (SelenideElement x:swoop.CategoryList){
            if (x.getText().contains("კვება")){
                actions().moveToElement(x).perform();
                break;
            }

        }
        return this;
    }
    @Step("სუშიზე დაკლიკება")
    public fourMethodStep thirdStep(){
        swoop.sushi.click();
        return this;
    }
    @Step("სიაში პირველ სუშიზე დაკლიკება")
    public fourMethodStep fourStep(){
        swoop.sushiList.get(0).click();
        return this;
    }
    @Step("გაზიარებაზე დაკლიკება")
    public fourMethodStep fiveStep(){
        swoop.sharebutt.click();
        return this;
    }
    @Step("ფაცებუქის ფანჯარაზე გადაცვლა")
    public fourMethodStep sixStep(){
        String mainPage = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String handle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!handle.equals(mainPage)) {
                WebDriverRunner.getWebDriver().switchTo().window(handle);
                break;
            }
        }
        return this;
    }

}
