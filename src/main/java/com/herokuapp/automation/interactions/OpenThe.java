package com.herokuapp.automation.interactions;

import com.herokuapp.automation.models.DataInjection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Interaction {

    DataInjection data = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(data.getUrl()));
    }

    public static OpenThe browser(){
        return new OpenThe();
    }
}
