package ru.ranepa;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("", 1);
        Student student1 = new Student("", 1);
        Student student2 = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи имя");
        String name = scanner.next();
        System.out.println("Введи курс");
        String course = scanner.next();

        System.out.println(student.averageMarks());
    }
}


