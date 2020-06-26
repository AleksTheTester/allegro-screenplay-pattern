package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pageobjects.pages.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseGdprWindow implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.GDPR_WINDOW)
        );
    }

    public static CloseGdprWindow close() {
        return instrumented(CloseGdprWindow.class);
    }
}
