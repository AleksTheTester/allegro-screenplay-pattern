package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static pageobjects.pages.LoginPage.PASSWORD_FIELD;
import static pageobjects.pages.LoginPage.USER_NAME_FIELD;

public class LoginToService{
    public static Task login(String login, String password) {
        return Task.where("{0} login to Allegro service",
                Enter.theValue(login)
                        .into(USER_NAME_FIELD),
                Enter.theValue(password)
                        .into(PASSWORD_FIELD)
        );
    }
}
