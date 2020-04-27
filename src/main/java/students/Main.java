package students;

import epam.task.Student;
import epam.task.StudentGroup;
import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentGroup g1 = new StudentGroup();

        for (; ; ) {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Введите ФИО студента");
            String newStudent = scan2.nextLine();

            Scanner scan3 = new Scanner(System.in);
            System.out.println("Введите возраст студента");
            int newStudentAge = scan3.nextInt();

            Scanner scan4 = new Scanner(System.in);
            System.out.println("Введите пол студента");
            String newStudentMale = scan4.nextLine();

            Student stud = new Student(newStudent, newStudentAge, newStudentMale);

            g1.addStudent(stud);

            System.out.println("Хотите добавить еще одного студента? (да/нет)");
            Scanner scan5 = new Scanner(System.in);
            String answer = scan5.nextLine();
            if (answer.equalsIgnoreCase("нет")) {
                g1.printAllStudents();
                return;
            }

        }

    }
}
