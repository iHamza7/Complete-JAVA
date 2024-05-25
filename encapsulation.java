class Boy {
    int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        Boy b = new Boy();
        b.setName("hamza khan is fr ");
        b.setAge(3);
        System.out.println(b.getAge() + " " + b.getName());
    }
}
