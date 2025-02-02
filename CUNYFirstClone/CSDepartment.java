package CUNYFirstClone;

public class CSDepartment extends QueensCollege {
    private String departmentHead;
    public CSDepartment(String departmentHead) {
        this.departmentHead = departmentHead;
    }
    public void printDepartmentInfo(){
        super.println("Department Head: " + this.departmentHead);
    }
}
