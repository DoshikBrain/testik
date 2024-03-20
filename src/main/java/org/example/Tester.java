package org.example;

import java.util.List;
import java.util.TreeSet;

public class Tester {
    private String name;
    private String surname;
    private String englishLevele;
    private double expirienceInYears;
    private double salary;
    static String vakansia="Открыта заявка на работу в лучшем колледже Беларуси";
    public Tester() {
        this("Неизвестно", "Неизвестно", 0, "Неизвестно", 0.0);
    }
    public Tester(String name, String surname) {
        this(name, surname, 0, "Неизвестно", 0.0);
    }

    public Tester(String name, String surname, double expirienceInYears, String EnglishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevele = EnglishLevel;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEnglishLevele() {
        return englishLevele;
    }

    public void setEnglishLevele(String englishLevele) {
        this.englishLevele = englishLevele;
    }

    public double getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(double expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void getIfoemation(List<Tester> listik)
    {
        for (Tester test: listik) {
            System.out.println("Фамилия:\t"+test.getSurname()+"\nИмя:\t"+test.getName()+"\nУровень Английского:\t"+test.getEnglishLevele()+"\nОпыт:\t"+test.getExpirienceInYears()+"\nЗп:\t"+test.getSalary());
        }
    }
    public void getIfoemation(Tester[] masiv)
    {
        for (Tester test: masiv) {
            System.out.println("Фамилия:\t"+test.getSurname()+"\nИмя:\t"+test.getName()+"\nУровень Английского:\t"+test.getEnglishLevele()+"\nОпыт:\t"+test.getExpirienceInYears()+"\nЗп:\t"+test.getSalary());
        }
    }
    public void getIfoemation(Tester obj)
    {
            System.out.println("Фамилия:\t"+obj.getSurname()+"\nИмя:\t"+obj.getName()+"\nУровень Английского:\t"+obj.getEnglishLevele()+"\nОпыт:\t"+obj.getExpirienceInYears()+"\nЗп:\t"+obj.getSalary());

    }
    static public void showVakansia()
    {
        System.out.println(vakansia);
    }

}
