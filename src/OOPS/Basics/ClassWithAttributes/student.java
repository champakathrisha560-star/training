package OOPS.Basics.ClassWithAttributes;

public class student {
    String name;//attributes
    int usn;
    student(String name, int usn){
        this.name=name;//constructors
        this.usn=usn;
    }
    void printDetails(){ //method
        System.out.println("The name is "+name);
        System.out.println("The usn is "+usn);
        }
}
class driver
{
    public static void main(String[] args) {
        student s1 = new student("Thrisha", 115);
        student s2 = new student("Ishitha", 123);

        s1.printDetails();
        s2.printDetails();
    }
}