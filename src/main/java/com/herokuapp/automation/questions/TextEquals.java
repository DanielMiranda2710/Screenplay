package com.herokuapp.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TextEquals implements Question<String> {


    Target target;

    public TextEquals(Target target){
        this.target=target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getTextValue().trim();
    }

    public static TextEquals correct(Target target){
        return new TextEquals(target);
    }}
