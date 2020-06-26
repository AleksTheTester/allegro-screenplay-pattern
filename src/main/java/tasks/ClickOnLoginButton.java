package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pageobjects.pages.LoginPage;

public class ClickOnLoginButton {

    public static Task click(){
        return Task.where("{0} click on login button",
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
