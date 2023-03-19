package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Lukichev Artem Alexeevich");
        student.setGroup("3505A");
        student.setDateStart(new Date());
        System.out.println("ФИО: " + student.getFullName() + ", группа: " + student.getGroup() + ", поступление: " + student.getDateStart());
    }
}
