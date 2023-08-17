package com.herokuapp.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepPage4 {

    public static final Target PASSWORD_INPUT  = Target.the("Write a password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT  = Target.the("Write a confirm password").located(By.id("confirmPassword"));
    public static final Target TERMS_OF_USE_CHECKBOX = Target.the("").
            locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[1]");
    public static final Target PRIVACY_AND_SECURITY_CHECKBOX = Target.the("").
            locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[last()]");
    public static final Target COMPLETE_SET_UP_BUTTON = Target.the("").locatedBy("//span[text()='Complete Setup']");
}
