import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();
        System.out.print("Enter student address: ");
        String studentAddress = input.nextLine();

        Student student = new Student(studentName, studentAddress);

        System.out.print("Enter course and grade (Contoh : PBO 100): ");
        String courseGrade = input.nextLine();
        String[] parts = courseGrade.split(" ");
        student.addCourseGrade(parts[0], Integer.parseInt(parts[1]));

        System.out.println(student.toString());
        student.printGrades();
        System.out.println("Average Grade: " + student.getAverageGrade());

        System.out.print("Enter teacher name: ");
        String teacherName = input.nextLine();
        System.out.print("Enter teacher address: ");
        String teacherAddress = input.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAddress);

        System.out.print("Enter course to add: ");
        String courseToAdd = input.nextLine();
        teacher.addCourse(courseToAdd);

        System.out.println(teacher.toString());

        input.close();
    }
}
