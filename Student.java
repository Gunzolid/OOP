package Week4;

public class Student {
    String id;
    String name;
    int year;
    
    // Default Constructor
    public Student(){
        this.id = "";
        this.name = "";
        this.year = 0;
    }
    
    public Student(String id, String name, int year){
        this.id = id;
        this.name = name;
        this.year = year;
    }
    
    //Overloding Constructor
    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.year = 4;
    }
    public void displayInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.year);
    }
}
