package Step;

import Page.SwoopLocators;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class firstMethodSteps {
    SwoopLocators swoop =new SwoopLocators();

    @Step()
    public firstMethodSteps firstStep(){
        for (SelenideElement x:swoop.categoryList){
            if (x.getText().contains("დასვენება")){
                x.click();
                break;
            }
        }
        return this;
    }
    @Step
    public firstMethodSteps secondStep(){
        swoop.minPrice.setValue("200");
        swoop.maxPrice.setValue("230");
        swoop.clickSearch.click();
        return this;
    }

}
