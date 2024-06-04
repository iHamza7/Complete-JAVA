
class Calculator {

    int a;

    public int add(int n1, int n2) {
        // System.out.println("add in there");
        int result = n1 + n2;
        return result;
    }

}

class Computer {
    public void playMusic() {
        System.out.println("Music playing  1 2 3 4 5 6 7 8 9 10");
    }

    public String getMeAPen(int cost) {
        return "Pen";
    }
}

public class classes {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;
        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println(result);

    }

}
