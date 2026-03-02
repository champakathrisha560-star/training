package OOPS.abstraction.partial;
abstract class RBI {
    abstract int ROI();

}
class HDFC extends RBI{
    @Override
    int ROI() {
        return 10;
    }
}
class SBI extends RBI{
    int ROI(){
        return 6;
    }
}

class Driver {
    static void main(String[] args) {
        HDFC h = new HDFC();
        System.out.println(h.ROI());

        SBI s = new SBI();
        System.out.println(s.ROI());
    }
}
