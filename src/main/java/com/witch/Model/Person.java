package com.witch.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {
    private int ageAtDeath;
    private int yearOfDeath;

    public int getYearOfBirth() {
        return yearOfDeath - ageAtDeath;
    }
}

