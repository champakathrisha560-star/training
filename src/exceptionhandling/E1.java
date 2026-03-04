package exceptionhandling;

public class E1 {
    static void main(String[] args) {
        int i=10,j=0,k=0;
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[20]);
        }
        catch (ArithmeticException e){
            System.out.println("you cant  divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid syntax");
        }
        catch(Exception e){
            System.out.println("unknown exception");
        }
        finally {
            System.out.println("this block will get executed");
        }
        System.out.println("Hello");
    }
}
