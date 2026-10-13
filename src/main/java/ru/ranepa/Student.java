package ru.ranepa;
import java.util.List;
 public class Student{
     String name;
     int course;
     List<Integer> marks;

     public Student(String name, int course, List<Integer> marks) {
         this.name = name;
         this.course = course;
         this.marks = marks;
     }

     public double averageMarks(){
         int sum = 0;
         for (Integer mark : marks){
             sum+=mark;
         }
         return (double) sum / marks.size()
     }
 }
