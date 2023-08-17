package com.herokuapp.automation.tasks;

import com.herokuapp.automation.ui.StepPage3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Step3 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(StepPage3.LAST_STEP_BUTTON)
        );
    }

    public static Step3 yourDevices(){
        return instrumented(Step3.class);
    }
}
