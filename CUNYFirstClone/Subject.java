package CUNYFirstClone;

public class Subject {
    private String subjectName;
    private String professorName; 
    public Subject(String subjectName, String professorName) {
        this.subjectName = subjectName;
        this.professorName = professorName;
    }
    public String getSubjectName(){
        return subjectName; 
    }
    public String getProfessorNme(){
        return professorName; 
    }
    public void displaySubjectInfo() {
        System.out.println("Subject: " + subjectName + ", Taught by: Prof. " + professorName);
    }
}
