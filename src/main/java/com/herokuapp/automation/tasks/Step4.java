package com.herokuapp.automation.tasks;

import com.herokuapp.automation.ui.StepPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Step4 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Choucair2023*").into(StepPage4.PASSWORD_INPUT),
                Enter.theValue("Choucair2023*").into(StepPage4.CONFIRM_PASSWORD_INPUT),
                JavaScriptClick.on(StepPage4.TERMS_OF_USE_CHECKBOX),
                JavaScriptClick.on(StepPage4.PRIVACY_AND_SECURITY_CHECKBOX),
                JavaScriptClick.on(StepPage4.COMPLETE_SET_UP_BUTTON));
    }

    public static Step4 password(){
        return instrumented(Step4.class);
    }

}
