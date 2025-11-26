package StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Student Course Management ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Enroll Student");
            System.out.println("6. View Enrollments");
            System.out.println("7. Exit");
            System.out.print("Enter option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    studentService.addStudent(name, email);
                }

                case 2 -> studentService.getAllStudents();

                case 3 -> {
                    System.out.print("Course Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Instructor: ");
                    String inst = sc.nextLine();
                    courseService.addCourse(cname, inst);
                }

                case 4 -> courseService.getAllCourses();

                case 5 -> {
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Course ID: ");
                    int cid = sc.nextInt();
                    enrollmentService.enrollStudent(sid, cid);
                }

                case 6 -> enrollmentService.viewEnrollments();

                case 7 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

