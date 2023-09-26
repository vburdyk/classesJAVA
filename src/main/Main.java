package main;

import student.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Creating a list of student objects
        List<Student> students = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        students.add(new Student(1, "Pasha", "Lacker", "Pavlovych", dateFormat.parse("10/05/2000"), "Kyiv", "1234567890", "Computer science", 2, "OI-22"));
        students.add(new Student(2, "Alex", "Alexin", "Alexovych", dateFormat.parse("15/03/2002"), "Lviv", "9876543210", "IPZ", 3, "PZ-32"));
        students.add(new Student(3, "Inav", "Inavin", "Inanovych", dateFormat.parse("20/08/2001"), "Lviv", "5555551234", "Engineer", 1, "ENGINEER-11"));

        Scanner scanner = new Scanner(System.in);

        printAllStudents(students);


        System.out.print("Please enter the faculty: ");
        String faculty = scanner.nextLine();
        printStudentsByFaculty(students, faculty);


        System.out.print("Please enter the group: ");
        String group = scanner.nextLine();
        printStudentsByGroup(students, group);


        System.out.print("Please enter the year of birthday: ");
        int year = scanner.nextInt();
        printStudentsBornAfterYear(students, year);

    }

    public static void printAllStudents(List<Student> students) {
        System.out.println("All students in university: ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void printStudentsByFaculty(List<Student> students, String faculty) {
        System.out.println("Students of faculty " + faculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public static void printStudentsBornAfterYear(List<Student> students, int year) {
        System.out.println("Students who born after " + year + " year:");
        for (Student student : students) {
            if (student.getBirthDate().getYear() + 1900 > year) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public static void printStudentsByGroup(List<Student> students, String group) {
        System.out.println("Students of group " + group + ":");
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }
}