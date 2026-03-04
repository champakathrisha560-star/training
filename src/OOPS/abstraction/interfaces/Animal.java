package OOPS.abstraction.interfaces;

public interface Animal {
    void eat();
    void run();
}

class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("eating..");
    }

    @Override
    public void run() {
        System.out.println("running...");
    }
}

class Driver{
    static void main(String[] args) {
        Dog d= new Dog();
       d.eat();
       d.run();
    }
}