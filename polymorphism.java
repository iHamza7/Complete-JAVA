
class A {
    public void show() {
        System.out.println("in show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in override show method 1 2 3 3] 4 5 6 7");
        super.show();
    }

}

public class polymorphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

    }

}
