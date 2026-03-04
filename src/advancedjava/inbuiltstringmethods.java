package advancedjava;

public class inbuiltstringmethods
{
    static void main(String[] args) {
        String s1="java programming";
        String s2= new String("java program");

        System.out.println("original string:"+s1);

        System.out.println("length:"+s1.length());
        System.out.println(("Character at index 2" + s1.charAt(2) ));

        System.out.println("Uppercase" + s1.toUpperCase());
        System.out.println("LowerCase" + s1.toLowerCase());

        System.out.println("Using =="+ (s1==s2));
        System.out.println(("Using equals():" + s1.equals(s2)));

        System.out.println("compareTo"+ s1.compareTo(s2));

    }

    }
