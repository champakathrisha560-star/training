package OOPS.encapsulation;

public class student {
    private String name;
    private int usn;
    static String college;

    student(String name,int u)
    {
        this.name=name;
        this.usn=u;
        college="sapthagiri";
    }
      String getName(){
        return name;

      }
      int usn(){
        return usn;

      }
      void setName(String n){
        name=n;
      }
      void setUsn(int usn){
        this.usn=usn;
      }

      void printDetails(){
          System.out.println("student name"+name);
          System.out.println("student usn"+usn);
      System.out.println("student college"+college);}
}

class Driver {
    static void main(String[] args) {
        student s1 = new student("THRISHA", 123);
        student s2 = new student("ishu", 12);
        s1.printDetails();
        s2.printDetails();

        s1.setName("ABC");
        s1.setUsn(123);
        System.out.println(s1.getName());

        s1.printDetails();

    }
}
