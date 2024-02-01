package Core_Java;

class Animal {
    void eat() {
        System.out.println("I am eating...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.eat();
    }
}
