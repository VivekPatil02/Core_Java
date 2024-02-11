package OOPs;
class Animal {
    void eat() {
        System.out.println("I am eating...");
    }
}

class Calculator{
    public int add(int n1,int n2){
        int result = n1+n2;
        return result;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.eat();

        Calculator calc = new Calculator();
        int addition = calc.add(5,6);
        System.out.println(addition);
    }
}
