class Animal {
    void eat1() {
        System.out.println("1");
    }
}

public class MethodOverriding extends Animal {
    void eat1() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat1();
    }
}
