
interface A {
    void show();

    void config();
}

class B implements A {

    public void config() {
        System.out.println("in a show config there");

    }

    public void show() {
        System.out.println("in a show method");

    }

}

public class interfaces {
    public static void main(String[] args) {

        B obj = new B();
        obj.config();
    }
}
