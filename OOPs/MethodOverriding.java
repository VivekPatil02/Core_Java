class Animal1 {
    void eat1() {
        System.out.println("vivek is running");
    }
}

//here extended Animal1 class so without inheritance method overriding can't happens(IS-A relationship)
public class MethodOverriding extends Animal1 {
    void eat1() {
        System.out.println("shakti is walking...");
    }

    public static void main(String[] args) {
        Animal1 a1 = new Animal1();
        a1.eat1(); // vivek is running
        // so here we can say that Animal1 class's eat1 method overide Methodoverriding class's eat1 method. 

        // now one think we must note that what if i call eat1 method from MethodOverriding class's object.right now i am calling eat1 method from Animal1 class's object a1 

        //let's do it
        MethodOverriding m1 = new MethodOverriding();
        m1.eat1();  // shakti is walking...
    }
}
