package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pageobjects.pages.LoginPage;

public class DisplayedItem implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.ALERT_MESSAGE)
                .viewedBy(actor)
                .asString();
    }
}
