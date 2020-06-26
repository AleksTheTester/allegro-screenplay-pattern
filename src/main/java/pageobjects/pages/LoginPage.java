package pageobjects.pages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target USER_NAME_FIELD = Target.the("User Name field")
            .locatedBy("//*[@id='username']");
    public static Target PASSWORD_FIELD = Target.the("User Name field")
            .locatedBy("//*[@id='password']");
    public static Target LOGIN_BUTTON = Target.the("User Name field")
            .locatedBy("//*[@id='login-button']");
    public static Target OPEN_LOGIN_PAGE_BUTTON = Target.the("User Name field")
            .locatedBy("//*[@name = 'login-button']/../div");
    public static Target ALERT_MESSAGE = Target.the("User Name field")
            .locatedBy("//*[@role = 'alert']");
}
