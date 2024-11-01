package HashMap;

public class Main {
    public static void main(String[] args) {
        Schedule newSchedule = new Schedule();

        Class classFirst = new Class("101", "History", "10:00");
        Class classSecond = new Class("203", "Physics", "11:30");
        Class classThird = new Class("304", "Chemistry", "14:00");

        newSchedule.addClass(classFirst);
        newSchedule.addClass(classSecond);
        newSchedule.addClass(classThird);

        System.out.println("All classes in schedule:");
        newSchedule.prntAllClasses();

        System.out.println("\nSearch class by the code 203:");
        System.out.println(newSchedule.searchClassByCode("203"));

        System.out.println("\nRemove class by the code 203:");
        newSchedule.removeClass("203");

        System.out.println("\nAll classes in schedule:");
        newSchedule.prntAllClasses();
    }
}
