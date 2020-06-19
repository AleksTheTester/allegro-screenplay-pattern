package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import page_objects.StartPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {
    StartPage startPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(startPage)
        );
    }

    public static Start openStartPage() {
        return instrumented(Start.class);
    }
}
