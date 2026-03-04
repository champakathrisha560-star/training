package advancedjava.StringBufferAndBuilder;

public class StringBufferExample {
    static void stringAppend() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original String is:" + sbf);
        sbf.append("World");
        System.out.println("New String is:" + sbf);
    }

    static void stringinsert() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original String is:" + sbf);
        sbf.insert(2, "world");
        System.out.println("New String is:" + sbf);
    }

    static void stringReverse() {
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original String is:" + sbf);
        sbf.reverse();
        System.out.println("New String is:" + sbf);
    }

    static void main(String[] args) {
        stringAppend();
        stringinsert();
        stringReverse();
    }
}