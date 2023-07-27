package Step;

import Page.SwoopLocators;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.actions;

public class thirdMethodStep {
    SwoopLocators swoop=new SwoopLocators();
    @Step("კატეგორიაზე დაქლიქება")
    public thirdMethodStep firstStep(){
        swoop.category.click();
        return this;
    }
    @Step("კვებასთან მაუსის მიტანა")
    public thirdMethodStep secondStep(){
        for (SelenideElement x:swoop.CategoryList){
            if (x.getText().contains("კვება")){
                actions().moveToElement(x).perform();
                break;
            }

        }
        return this;
    }
    @Step("სუშიზე დაქლიქება")
    public thirdMethodStep thirdStep(){
        swoop.sushi.click();
        return this;
    }
    @Step("სორტირებაზე დაქლიქება")
    public thirdMethodStep fourStep(){
        swoop.sort.click();
        return this;
    }
    @Step("სორტირების არჩევა ზემოდან ქვემოთ")
    public thirdMethodStep fivestep(){
        swoop.sortpick.click();
        return this;
    }
}
