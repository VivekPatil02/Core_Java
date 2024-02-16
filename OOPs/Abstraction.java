package OOPs;

abstract class AdvCalc {
    private int marks;
    abstract int run(int a, int b);
}

// what abstraction - so basically in abstraction class we are hiding detail implementation as you can see run method defined body,marks variable just initialized and using it in Abstraction class to override the method.

public class Abstraction extends AdvCalc {
    @Override
    int run(int a, int b) {
        System.out.println(a + b);
        return 0; // Add this line if you want to keep the return type as int
    }

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.run(4, 5);
    }
}
