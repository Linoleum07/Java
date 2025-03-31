package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "None", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "None", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary, double bonus) {
        this.salary = salary + bonus;
    }

    public void setSalary(String level) {
        switch (level) {
            case "Junior":
                this.salary = 1000.0;
                break;
            case "Middle":
                this.salary = 3000.0;
                break;
            case "Senior":
                this.salary = 6000.0;
                break;
            default:
                this.salary = 0.0;
        }
    }

    public static String compareSalary(Tester t1, Tester t2) {
        if (t1.salary > t2.salary) {
            return t1.name + " зарабатывает больше, чем " + t2.name;
        } else if (t1.salary < t2.salary) {
            return t2.name + " зарабатывает больше, чем " + t1.name;
        } else {
            return "Оба тестировщика зарабатывают одинаково";
        }

    }
}

