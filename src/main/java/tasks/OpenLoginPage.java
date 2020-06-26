package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pageobjects.pages.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenLoginPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.OPEN_LOGIN_PAGE_BUTTON)
        );
    }

    public static OpenLoginPage open() {
        return instrumented(OpenLoginPage.class);
    }

}
