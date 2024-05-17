
class A {
    public void show() {
        System.out.println("in show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in anjjc,e  kkthd");
        super.show();
    }

}

public class polymorphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

    }

}
