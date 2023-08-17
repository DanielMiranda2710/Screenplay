package com.herokuapp.automation.tasks;

import com.herokuapp.automation.models.DataInjection;
import com.herokuapp.automation.ui.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CorrectForm implements Task {

    DataInjection data = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getFirstName()).into(RegisterPage.FIRSTNAME_INPUT),
                Enter.theValue(data.getLastName()).into(RegisterPage.LASTNAME_INPUT),
                Enter.theValue(data.getEmail()).into(RegisterPage.EMAIL_INPUT),
                Click.on(RegisterPage.MONTH_SELECT),
                Click.on(RegisterPage.JANUARY_OPTION),
                Click.on(RegisterPage.BIRTHDAY_SELECT),
                Click.on(RegisterPage.FIVE_DAY_OPTION),
                Click.on(RegisterPage.BIRTH_YEAR_SELECT),
                Click.on(RegisterPage.NINETY_YEAR_OPTION),
                Click.on(RegisterPage.NEXT_LOCATION_BUTTON),
                Enter.theValue("050026").into(RegisterPage.ZIP_INPUT).thenHit(Keys.ENTER),
                JavaScriptClick.on(RegisterPage.COUNTRY_CLICK),
                Enter.theValue("Colombia").into(RegisterPage.COUNTRY_INPUT),
                JavaScriptClick.on(RegisterPage.NEXT_DEVICES_BUTTON)
                );
    }

    public static CorrectForm auth(){
        return instrumented(CorrectForm.class);
    }

}
