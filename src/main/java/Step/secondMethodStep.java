package Step;
import Page.SwoopLocators;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.actions;

public class secondMethodStep {

    SwoopLocators swoop=new SwoopLocators();
    @Step
    public secondMethodStep firstStep(){
        swoop.category.click();
        return this;
    }
    @Step
    public secondMethodStep secondStep(){
        for (SelenideElement x:swoop.CategoryList){
            if (x.getText().contains("კვება")){
                actions().moveToElement(x).perform();
                break;
            }

        }
        return this;
    }
    @Step
    public secondMethodStep thirdStep(){
        swoop.sushi.click();
        return this;
    }
    @Step
    public secondMethodStep fourStep(){
        swoop.favoriteButtList.get(0).click();
        return this;
    }
}
