
class A {
    public void show() {
        System.out.println("in show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in a show me  kkthd");
        super.show();
    }

}

public class polymorphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

    }

}
