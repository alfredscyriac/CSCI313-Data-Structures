package CUNYFirstClone;

public class Main {
    public static void main(String[] args) {
        Subject csci313 = new Subject("CSCI 313 - Data Structures", "Baci"); 
        Subject csci320 = new Subject("CSCI 320 - Theory of Computation", "Obrenic"); 
        Subject lcd101 = new Subject("LCD 101  - Introduction to Language", "Tapia");
        Subject engl210w = new Subject("ENGL 210W - Introduction to Creative Writing","Weir"); 
        Subject math241 = new Subject("MATH 241 - Introduction to Probability & Statistics","Sisser");
    
        Students alfred = new Students("Alfred",19,1234);

        alfred.enrollSubject(csci313);
        alfred.enrollSubject(csci320); 
        alfred.enrollSubject(math241); 
        alfred.enrollSubject(engl210w); 
        alfred.enrollSubject(lcd101); 

        alfred.displayInfo(); 
    }
}
