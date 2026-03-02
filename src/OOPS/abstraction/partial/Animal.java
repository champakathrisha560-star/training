package OOPS.abstraction.partial;


abstract class Animal {
    abstract void eat();

    void run(){
        System.out.println("RUNNING");
    }
}

class lion extends Animal{
    void eat(){
        System.out.println("MEAT");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("Grass");
    }
}

class driver{
    static void main(String[] args) {
        lion l= new lion();
        l.run();
        l.eat();


        deer d= new deer();
        d.eat();

    }
}