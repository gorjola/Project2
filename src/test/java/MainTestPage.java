import Data.SqlData;
import Util.BeforXafter;
import Step.*;
import io.qameta.allure.*;
import org.testng.annotations.Test;
@Epic("Regresion test")
@Feature("Operations in swoop")
public class MainTestPage extends BeforXafter {
    firstMethodSteps step=new firstMethodSteps();
    secondMethodStep step2=new secondMethodStep();
    thirdMethodStep  step3=new thirdMethodStep();
    fourMethodStep step4=new fourMethodStep();
    fiveMethodStep step5=new fiveMethodStep();
    AssertStep asert=new AssertStep();


    @Test(groups = "Resgression1",description = "პირველი მეთოდი")
    @Story("სასტუმროს ფასების გაფილტვრა")
    @Severity(SeverityLevel.BLOCKER)
    public void FirstMethod(){
           step.firstStep().
                secondStep();
           asert.firstMethodAssert();
    }

    @Test(groups ="Resgression1",description = "მეორე მეთოდი")
    @Story("გაყიდული ვაუჩერების შემოწმება")
    public void SecondMethod(){
        step2.firstStep().
                secondStep().
                thirdStep().
                fourStep();
        asert.secondMethodAssert();
        asert.secondMethodAssert2();
    }

    @Test(groups = "Resgression2",description = "მესამე მეთოდი")
    @Story("პირველი და შემდეგი სუშის ფასის შედარება")
    public void ThirdMethod(){
        step3.firstStep().
                secondStep().
                thirdStep().
                fourStep().
                fivestep();
        asert.thirdMethodAssert();
    }
    @Test(groups = "Resgression2",description = "მეოთხე მეთოდი")
    @Story("ფაცებუქის :დ ფანჯრის შემოწმება თუ გამოაქ")
    public void FourMethod(){
        step4.firstStep().
                secondStep().
                thirdStep().
                fourStep().
                fiveStep().
                sixStep();
        asert.fourMethodAssert();
    }
    @Test(groups = "Resgression2",dataProvider = "user",dataProviderClass = SqlData.class,description = "მეხუთე მეთოდი")
    @Story("სქლ ელემენტებით რეგისტრაციის შევსება და ნახვა თუ გამოიტანს გამოტოვებულ სქესის ერორს")
    public void FiveMethod(String firstname,String lastname,String phone,String email,String dateOfBirth,String password){
          step5.firstStep().
                secondStep().
                  thirdStep(firstname,lastname,phone,email,dateOfBirth,password).
                  fourStep();
          asert.fiveMethodAssert();

    }


}
