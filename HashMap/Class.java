package HashMap;

public class Class {
    
    private final String classCode;
    private final String subjectName;
    private final String time;

    public Class(String classCode, String subjectName, String time) {
        this.classCode = classCode;
        this.subjectName = subjectName;
        this.time = time;
    }

    public String getClassCode() {
        return classCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Class code: " + classCode + "\n" + "Subject name: " + subjectName + "\n" + "Time: " + time;
    }
}