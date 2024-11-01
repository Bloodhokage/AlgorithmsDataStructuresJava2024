package HashMap2;

import java.util.HashMap;

public class Schedule2 {
    private HashMap<String, Class2> classes;

    // Constructor to initialize the schedule
    public Schedule2() {
        classes = new HashMap<>();
    }

    // Method to add a class to the schedule
    public void addClass(Class2 newClass) {
        classes.put(newClass.getClassCode(), newClass);
    }

    // Method to remove a class from the schedule by code
    public void removeClass(String classCode) {
        classes.remove(classCode);
    }

    // Method to find a class by its code
    public Class2 findClass(String classCode) {
        return classes.get(classCode);
    }

    // Method to display all classes in the schedule
    public void displayAllClasses() {
        if (classes.isEmpty()) {
            System.out.println("The schedule is empty.");
        } else {
            for (Class2 c : classes.values()) {
                System.out.println(c);
            }
        }
    }
}
