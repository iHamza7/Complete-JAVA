class Cat {

    public int getlegs(int legs) {
        return legs;
    }

    public String getGroup(String group) {
        return group;
    }
}

class Dog extends Cat {
    public String getFood(String food) {
        return food;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        int legs = d.getlegs(2);
        String group = d.getGroup("dog e eats meal");

        System.out.println(legs + " " + group);
    }
}
