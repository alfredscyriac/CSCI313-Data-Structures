package CUNYFirstClone;

public class QueensCollege extends College {
    public QueensCollege(){
        super("Queens College", "Flushing, New York");
    }
    public void println(String s){
        System.out.println(s);
    }
    public void printInfo(){
        println("College Name: "+this.CollegeName); 
        println("College Location: "+this.CollegeLocation);
    }
}
