
interface A {
    void show();

    void config();
}

// types of interface
// 1) normal interface
// 2) functional/SAM SAM => single abstract method
// 3) marker [interface] => no methods its empty

class B implements A {

    public void config() {
        System.out.println("in a show config  method");

    }

    public void show() {
        System.out.println("in a show method 1 2 ");

    }

}

public class interfaces {
    public static void main(String[] args) {

        B obj = new B();
        obj.config();
    }
}
