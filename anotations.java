interface A {
    void show();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("this is override 1 2 3 4");

    }
}

public class anotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
