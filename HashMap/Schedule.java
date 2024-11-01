package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private HashMap <String, Class> schedule;

    public Schedule () {
        schedule = new HashMap<>();
    }

    public void addClass (Class tempClass) {
        schedule.put(tempClass.getClassCode(), tempClass);
    }

    public void removeClass(String classCode) {
        if (schedule.containsKey(classCode)) {
            schedule.remove(classCode);
            System.out.println("Class with code " + classCode + " removed." );
        }
        else {
            System.out.println("Class with code " + classCode + " not found." );
        }
    }

    public Class searchClassByCode (String classCode) {
        return schedule.get(classCode);
    }

    public void prntAllClasses () {
        if (!schedule.isEmpty()) {
            for (Map.Entry<String, Class> element : schedule.entrySet()) {
                System.out.println(element.getValue());
            }
        }
        else {
            System.out.println("0 classes");
        }
    }
}