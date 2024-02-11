class Animal {
    void eat1() {
        System.out.println("vivek is running");
    }
}

//here extended Animal class so without inheritance method overriding can't happens(IS-A relationship)
public class MethodOverriding extends Animal {
    void eat1() {
        System.out.println("shakti is walking...");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat1(); // vivek is running
        // so here we can say that Animal class's eat1 method overide Methodoverriding class's eat1 method. 

        // now one think we must note that what if i call eat1 method from MethodOverriding class's object.right now i am calling eat1 method from Animal class's object a1 

        //let's do it
        MethodOverriding m1 = new MethodOverriding();
        m1.eat1();  // shakti is walking...
    }
}
