package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surName;
    private String education;
    private String birthDay;

    public Profession() {

    }

    public Profession(String name, String surName, String education, String birthDay) {
        this.name = name;
        this.surName = surName;
        this.education = education;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthDay() {
        return birthDay;
    }

}
