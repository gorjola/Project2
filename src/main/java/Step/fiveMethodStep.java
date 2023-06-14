package Step;
import Page.SwoopLocators;
import io.qameta.allure.Step;

public class fiveMethodStep {
    SwoopLocators swoop=new SwoopLocators();
    @Step
    public fiveMethodStep firstStep(){
        swoop.shesvla.click();
        return this;
    }
    @Step
    public  fiveMethodStep secondStep(){
        swoop.registracia.click();
        return this;
    }
    @Step
    public fiveMethodStep thirdStep(String firstname,String lastname,String phone,String email,String dateOfBirth,String password){

        swoop.saxeli.setValue(firstname);
        swoop.gvari.setValue(lastname);
        swoop.mobiluri.setValue(phone);
        swoop.elposta.setValue(email);
        swoop.tarigi.setValue(dateOfBirth);
        swoop.paroli.setValue(password);
        swoop.gaimeoretParoli.setValue(password);

        return this;
    }
    @Step
    public fiveMethodStep fourStep(){
        swoop.vetanxmebi1.click();
        swoop.registracionButt.click();
        return this;
    }








}

