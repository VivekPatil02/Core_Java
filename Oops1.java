class Animal extends Birds {
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
        
        Animal dog = new Animal();
        dog.name = "laprador";
        dog.breed = "German";
        dog.color = "black";
        dog.eat(); 
        dog.sleep();
        // now you can see a dog is the object created from Animal class so can't access
        // sleep method of Birds class but here Animal class extends Birds class so now it can access
    }
    
}
