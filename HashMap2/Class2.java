package HashMap2;

public class Class2 {
    private String classCode;
    private String subjectName;
    private String time;

    public Class2(String classCode, String subjectName, String time) {
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
        return "Class code: " + classCode + ", Subject name: " + subjectName + ", Time: " + time;
    }
}
