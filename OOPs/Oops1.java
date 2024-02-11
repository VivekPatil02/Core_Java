class Animal2 extends Birds {
    String name;
    String breed;
    String color;

    void eat(){
        System.out.println( name + " is eating which is from " + breed + " breed and has " + color + " color.");
    }
}

class Birds {
    void sleep(){
        System.out.println("i am sleeping");
    }
}

public class Oops1 {
    public static void main(String[] args) {
        
        Animal2 dog = new Animal2();
        dog.name = "laprador";
        dog.breed = "German";
        dog.color = "black";
        dog.eat(); 
        dog.sleep();
        // now you can see a dog is the object created from Animal2 class so can't access
        // sleep method of Birds class but here Animal2 class extends Birds class so now it can access
    }
    
}
