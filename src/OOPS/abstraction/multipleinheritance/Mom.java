package OOPS.abstraction.multipleinheritance;

interface Mom{
    void cook();
}

interface Dad{
    void cook();
}

class Child implements Mom,Dad{
    @Override
    public void cook() {
        System.out.println("Indian");
    }
}

class Driver1 {
    public static void main(String[] args) {
        Child c = new Child() ;

            c.cook();
        }
    }
