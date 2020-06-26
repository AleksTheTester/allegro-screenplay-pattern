package questions;

import net.serenitybdd.screenplay.Question;

public class TheAlert {

    public static Question<String> displayed(){
        return new DisplayedItem();
    }
}
