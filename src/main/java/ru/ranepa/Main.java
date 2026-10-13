package ru.ranepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sca.nextLine();

        System.out.print("Enter a course: ");
        int course = sca.nextInt();

        List<Integer> marks = new ArrayList<>();
        System.out.println("Enter marks (0 - end):");

        int z = -1;
        while (z != 0) {
            z = sca.nextInt();
            if (z != 0) {
                marks.add(z);
            }
        }

        Student student = new Student(name, course, marks);
        student.printReport();
    }
}