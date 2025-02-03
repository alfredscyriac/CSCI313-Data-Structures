package CUNYFirstClone;
import java.util.ArrayList;
import java.util.List;

public class Students extends People {
    private int studentID;
    private List<Subject> enrolledSubjects;
    public Students(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
        this.enrolledSubjects = new ArrayList<>();
    }
    public void enrollSubject(Subject subject) {
        if (enrolledSubjects.contains(subject)) {
            System.out.println("Already enrolled in: " + subject.getSubjectName());
        } else {
            enrolledSubjects.add(subject);
            System.out.println("Enrolled in: " + subject.getSubjectName());
        }
    }
    public void dropSubject(String subjectName) {
        boolean found = false;
        for (Subject subject : enrolledSubjects) {
            if (subject.getSubjectName().equalsIgnoreCase(subjectName)) {
                enrolledSubjects.remove(subject);
                System.out.println("Dropped: " + subject.getSubjectName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Subject not found: " + subjectName);
        }
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Enrolled Subjects:");
        if (enrolledSubjects.isEmpty()) {
            System.out.println("No subjects enrolled yet.");
        } else {
            for (Subject subject : enrolledSubjects) {
                subject.displaySubjectInfo();
            }
        }
    }
}
