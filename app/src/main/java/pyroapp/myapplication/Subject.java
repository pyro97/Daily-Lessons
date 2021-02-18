package pyroapp.myapplication;

public class Subject {
    private String classroom,subjectName,time;

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Subject(String classroom, String subjectName, String time) {
        this.classroom = classroom;
        this.subjectName = subjectName;
        this.time = time;
    }
}
