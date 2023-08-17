package com.herokuapp.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ElementEnabled implements Question<Boolean> {

    Target target;

    public ElementEnabled(Target target){
        this.target = target;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(target).answeredBy(actor).isEnabled();
    }

    public static Question<Boolean> correct (Target target){
        return new ElementEnabled(target);
    }
}
