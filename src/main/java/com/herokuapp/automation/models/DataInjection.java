package com.herokuapp.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String url, firstName, LastName, email;

    public DataInjection(){
        this.firstName = "Pablo";
        this.LastName = "Hoyos";
        this.url = "https://utest.com/signup/personal";
        this.email = faker.internet().emailAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getUrl() {
        return url;
    }

    public String getEmail() {
        return email;
    }
}
