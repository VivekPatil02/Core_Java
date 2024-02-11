public class Polymorphism1 {
    //here run methods with same name in same class
    //so when i call this method in main method which method would be called.so for that we have to keep in mind three things for the method overloading.
    // 1. same names of methods in same class but no args/args or sequence of args is changes or nums of args 
    void run(){
        System.out.println("i am running");
    }
    void run(int a){
        System.out.println( a + " is walking.");
    }

    public static void main(String[] args) {
        Polymorphism1 p1 = new Polymorphism1();
        p1.run();
        p1.run(10);
        //this is method overloading
    }
}
