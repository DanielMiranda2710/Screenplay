package com.herokuapp.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class StepPage3 {
    public static final Target SELECT_BRAND_CLICK  = Target.the("Select a brand click").locatedBy("//span[text()='Select Brand']");
    public static final Target BRAND_INPUT  = Target.the("Write a brand").locatedBy("//input[@placeholder='Select Brand']']");
    public static final Target SELECT_MODEL_CLICK  = Target.the("Select a model click").locatedBy("//span[text()='Select a Model']");
    public static final Target MODEL_INPUT  = Target.the("Write a Model").locatedBy("//input[@placeholder='Select a Model']']");
    public static final Target LAST_STEP_BUTTON = Target.the("last step button").locatedBy("//span[text()='Next: Last Step']");
}
