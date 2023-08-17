package com.herokuapp.automation.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    public static final Target FIRSTNAME_INPUT = Target.the("Input tag of first name").located(By.id("firstName"));
    public static final Target LASTNAME_INPUT = Target.the("Input tag of last name").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Input tag of email").located(By.id("email"));
    public static final Target MONTH_SELECT = Target.the("Select tag of month").located(By.id("birthMonth"));
    public static final Target JANUARY_OPTION = Target.the("Option tag of january").locatedBy("//option[@label='January']");
    public static final Target BIRTHDAY_SELECT = Target.the("Select tag of birthday").located(By.id("birthDay"));
    public static final Target FIVE_DAY_OPTION = Target.the("Option tag of five").locatedBy("//option[@label='5']");
    public static final Target BIRTH_YEAR_SELECT = Target.the("Select tag of birth year").located(By.id("birthYear"));
    public static final Target NINETY_YEAR_OPTION  = Target.the("Option tag of 1990").locatedBy("//option[@label='1990']");
    public static final Target NEXT_LOCATION_BUTTON  = Target.the("Button to next location").locatedBy("//span[text()='Next: Location']");
    public static final Target CITY_INPUT = Target.the("City").located(By.id("city"));
    public static final Target ZIP_INPUT = Target.the("Zip").located(By.id("zip"));
    public static final Target COUNTRY_CLICK = Target.the("").locatedBy("//span[text()='Select a country']");
    public static final Target COUNTRY_INPUT = Target.the("Country").locatedBy("//input[@placeholder='Select a country']");
    public static final Target NEXT_DEVICES_BUTTON  = Target.the("Button to next location").locatedBy("//span[text()='Next: Devices']");



}
