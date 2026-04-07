package project;
import java.util.*;

public class Main {
	
	    public static void main(String[] args) {

	        ArrayList<Student> students = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1. Add Student");
	            System.out.println("2. Display Students");
	            System.out.println("3. Search Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Exit");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Age: ");
	                    int age = sc.nextInt();

	                    students.add(new Student(id, name, age));
	                    System.out.println("Student added successfully!");
	                    break;

	                case 2:
	                    if (students.isEmpty()) {
	                        System.out.println("No students found.");
	                    } else {
	                        for (Student s : students) {
	                            s.display();
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter ID to search: ");
	                    int searchId = sc.nextInt();
	                    boolean found = false;

	                    for (Student s : students) {
	                        if (s.getId() == searchId) {
	                            s.display();
	                            found = true;
	                        }
	                    }

	                    if (!found) {
	                        System.out.println("Student not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter ID to delete: ");
	                    int deleteId = sc.nextInt();

	                    students.removeIf(s -> s.getId() == deleteId);
	                    System.out.println("Student deleted (if existed).");
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	}

