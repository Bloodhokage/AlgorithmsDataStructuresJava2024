package HashMap2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Schedule2 schedule = new Schedule2();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a class");
            System.out.println("2. Remove a class");
            System.out.println("3. Find a class");
            System.out.println("4. Show all classes");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter the class code: ");
                    String code = scanner.nextLine();
                    System.out.print("Enter the subject name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the time: ");
                    String time = scanner.nextLine();

                    Class2 newClass = new Class2(code, name, time);
                    schedule.addClass(newClass);
                    System.out.println("Class added.");
                    break;

                case 2:
                    System.out.print("Enter the class code to remove: ");
                    String removeCode = scanner.nextLine();
                    schedule.removeClass(removeCode);
                    System.out.println("Class removed.");
                    break;

                case 3:
                    System.out.print("Enter the class code to search: ");
                    String searchCode = scanner.nextLine();
                    Class2 foundClass = schedule.findClass(searchCode);
                    if (foundClass != null) {
                        System.out.println("Found class: " + foundClass);
                    } else {
                        System.out.println("Class not found.");
                    }
                    break;

                case 4:
                    System.out.println("All classes:");
                    schedule.displayAllClasses();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
