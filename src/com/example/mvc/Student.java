package com.example.mvc;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String language;

    private final Map<String, String> countryOptions;

    public Student() {
        countryOptions = new HashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("LN", "London");
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    public Map<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
