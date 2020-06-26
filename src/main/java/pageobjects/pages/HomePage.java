package pageobjects.pages;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target GDPR_WINDOW= Target.the("GDPR window")
            .locatedBy("//button[@data-role='accept-consent']");
}
